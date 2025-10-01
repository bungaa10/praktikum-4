package multilevelInheritance;

// Kelas turunan dari BukuPelajaran (child dari child)
public class BukuMatematika extends BukuPelajaran {
    private String jenisMatematika;
    private boolean adaPembahasan;
    
    public BukuMatematika(String judul, String penulis, double harga,
                         String tingkatPendidikan, String jenisMatematika, 
                         boolean adaPembahasan) {
        // Memanggil constructor BukuPelajaran
        super(judul, penulis, harga, "Matematika", tingkatPendidikan);
        this.jenisMatematika = jenisMatematika;
        this.adaPembahasan = adaPembahasan;
    }
    
    // Method khusus BukuMatematika
    public void hitungSoal() {
        System.out.println("Menghitung soal matematika dari buku: " + judul);
    }
    
    public void cekKesulitan() {
        System.out.println("Buku " + judul + " untuk tingkat " + tingkatPendidikan);
    }
    
    // Override method dari BukuPelajaran
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method BukuPelajaran
        System.out.println("Jenis Matematika: " + jenisMatematika);
        System.out.println("Pembahasan: " + (adaPembahasan ? "Tersedia" : "Tidak Tersedia"));
    }
}