package hybridInheritance;

public class Main {
    public static void main(String[] args) {
        BukuCetak cetak = new BukuCetak("Pemrograman Java", "Budi", 300);
        BukuDigital digital = new BukuDigital("Algoritma Pemogramman", "Sari", 5.6);
        BukuKomprehensif komprehensif = new BukuKomprehensif("Pemmograman Berorientasi Objek", "Andi");

        System.out.println("\nBuku Cetak :");
        cetak.infoBuku();
        cetak.cetak();
        cetak.membaca();

        System.out.println("\nBuku Digital :");
        digital.infoBuku();
        digital.membaca();

        System.out.println("\nBuku Komprehensif :");
        komprehensif.infoBuku();
        komprehensif.cetak();
        komprehensif.membaca();
    }
}
