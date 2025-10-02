package multilevelInheritance;

public class BukuMatematika extends BukuPelajaran {
    
    public BukuMatematika(String judul, String pengarang) {
        
        super(judul, pengarang);
    }
    public void hitungSoal() {
        System.out.println("Menghitung soal matematika dari buku: " + judul);
    }
    
}