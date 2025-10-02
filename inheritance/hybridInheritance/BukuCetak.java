package hybridInheritance;

public class BukuCetak extends Buku implements Cetakable {
    public BukuCetak(String judul, String pengarang, int jumlahHalaman) {
        super(judul, pengarang);
    }
    public void cetak() {
        System.out.println("Bunga sedang Mencetak buku cetak dengan " + judul );
    }
    public void membaca() {
        System.out.println("Bunga Membaca buku cetak \"" + judul );
    }
}
