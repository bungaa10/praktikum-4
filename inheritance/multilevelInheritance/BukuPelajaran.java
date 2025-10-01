package multilevelInheritance;

public class BukuPelajaran extends Buku {
    protected String mataPelajaran;
    protected String tingkatPendidikan;
    
    public BukuPelajaran(String judul, String pengarang) {
        super(judul, pengarang);
    }
    // public void belajar() {
    //     System.out.println("Belajar " + mataPelajaran + " dari buku: " + judul);
    // }
    // public void tampilkanInfo() {
    //     super.tampilkanInfo();
    //     System.out.println("Mata Pelajaran: " + mataPelajaran);
        
    // }
}