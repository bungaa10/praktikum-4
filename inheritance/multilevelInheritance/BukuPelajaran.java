package multilevelInheritance;

public class BukuPelajaran extends Buku {
    public String mataPelajaran;
    
    
    public BukuPelajaran(String judul, String pengarang) {
        super(judul, pengarang);
    }
    // public void tampilkanInfo() {
    //     super.tampilkanInfo();
    //     System.out.println("Mata Pelajaran: " + mataPelajaran);
        
    // }
}