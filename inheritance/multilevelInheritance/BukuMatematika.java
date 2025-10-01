package multilevelInheritance;

public class BukuMatematika extends BukuPelajaran {
    // public String jenisMatematika;
    
    public BukuMatematika(String judul, String pengarang) {
        
        super(judul, pengarang);
    }
    public void hitungSoal() {
        System.out.println("Menghitung soal matematika dari buku: " + judul);
    }
    // public void cekKesulitan() {
    //     System.out.println("Buku " + judul + " untuk tingkat " + tingkatPendidikan);
    // }
    // public void tampilkanInfo() {
    //     super.tampilkanInfo(); 
    //     System.out.println("Jenis Matematika: " + jenisMatematika);
    // }
}