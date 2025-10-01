package hybridInheritance;

// Interface untuk buku cetak
public interface BukuCetak {
    void infoCetak();
    int getJumlahHalaman();
    default void caraBaca() {
        System.out.println("Baca secara fisik dengan membuka halaman");
    }
}