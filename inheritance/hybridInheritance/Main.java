package hybridInheritance;

public class Main {
    public static void main(String[] args) {
        BukuCetak cetak = new BukuCetak("Pemrograman Java", "Budi", 300);
        BukuDigital digital = new BukuDigital("Algoritma Pemogramman", "Sari", 5.6);
        BukuMatematika Matematika = new BukuMatematika("Pemmograman Berorientasi Objek", "Andi");

        System.out.println("\nBuku Cetak :");
        cetak.showInfo();
        cetak.cetak();
        cetak.membaca();

        System.out.println("\nBuku Digital :");
        digital.showInfo();
        digital.membaca();

        System.out.println("\nBuku Matematika :");
        Matematika.showInfo();
        Matematika.cetak();
        Matematika.membaca();
    }
}
