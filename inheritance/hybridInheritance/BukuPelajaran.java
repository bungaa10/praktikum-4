package hybridInheritance;

// Subclass dari Buku - Bagian dari hierarchical inheritance
public class BukuPelajaran extends Buku {
    protected String mataPelajaran;
    protected String tingkat;
    
    public BukuPelajaran(String judul, String penulis, double harga, 
                        String mataPelajaran, String tingkat) {
        super(judul, penulis, harga);
        this.mataPelajaran = mataPelajaran;
        this.tingkat = tingkat;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("=== BUKU PELAJARAN ===");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Tingkat: " + tingkat);
        System.out.println("Harga: Rp " + harga);
    }
    
    public void belajar() {
        System.out.println("Belajar " + mataPelajaran + " dari buku: " + judul);
    }
}
