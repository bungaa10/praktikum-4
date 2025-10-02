package multilevelInheritance;

public class BukuPelajaran extends Buku {
    public String mataPelajaran;
    
    
    public BukuPelajaran(String judul, String pengarang) {
        super(judul, pengarang);
    }
}