package multilevelInheritance;

// Kelas turunan pertama dari Buku
public class BukuPelajaran extends Buku {
    protected String mataPelajaran;
    protected String tingkatPendidikan;
    
    public BukuPelajaran(String judul, String penulis, double harga, 
                        String mataPelajaran, String tingkatPendidikan) {
        super(judul, penulis, harga); // Memanggil constructor parent class
        this.mataPelajaran = mataPelajaran;
        this.tingkatPendidikan = tingkatPendidikan;
    }
    
    // Method tambahan khusus BukuPelajaran
    public void belajar() {
        System.out.println("Belajar " + mataPelajaran + " dari buku: " + judul);
    }
    
    // Override method dari parent class
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method parent
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Tingkat Pendidikan: " + tingkatPendidikan);
    }
}