package hybridInheritance;

public class BukuCetak extends Buku implements Cetakable {
    public BukuCetak(String judul, String pengarang, int jumlahHalaman) {
        super(judul, pengarang);
    }
    public void cetak() {
        System.out.println("Mencetak buku cetak dengan " + judul );
    }
    public void membaca() {
        System.out.println("Membaca buku cetak \"" + judul );
    }
}
