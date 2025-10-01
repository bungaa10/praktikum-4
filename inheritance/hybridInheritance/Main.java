package hybridInheritance;

public class Main {
    public static void main(String[] args) {
        BukuCetak cetak = new BukuCetak("Pemrograman Java", "Budi", 300);
        BukuDigital digital = new BukuDigital("Algoritma", "Sari", 5.6);
        BukuKomprehensif komprehensif = new BukuKomprehensif("PBO Lengkap", "Andi");

        System.out.println("=== Buku Cetak ===");
        cetak.infoBuku();
        cetak.cetak();
        cetak.membaca();

        System.out.println("\n=== Buku Digital ===");
        digital.infoBuku();
        digital.membaca();

        System.out.println("\n=== Buku Komprehensif ===");
        komprehensif.infoBuku();
        komprehensif.cetak();
        komprehensif.membaca();
    }
}
