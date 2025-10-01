package hybridInheritance;

// Subclass lain dari Buku - Melengkapi hierarchical inheritance
public class BukuReferensi extends Buku {
    protected String bidangIlmu;
    protected boolean adaIndeks;
    
    public BukuReferensi(String judul, String penulis, double harga,
                        String bidangIlmu, boolean adaIndeks) {
        super(judul, penulis, harga);
        this.bidangIlmu = bidangIlmu;
        this.adaIndeks = adaIndeks;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("=== BUKU REFERENSI ===");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Bidang Ilmu: " + bidangIlmu);
        System.out.println("Memiliki Indeks: " + (adaIndeks ? "Ya" : "Tidak"));
        System.out.println("Harga: Rp " + harga);
    }
    
    public void referensi() {
        System.out.println("Menggunakan " + judul + " sebagai referensi " + bidangIlmu);
    }
}
