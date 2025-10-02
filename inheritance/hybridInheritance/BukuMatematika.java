package hybridInheritance;

public class BukuMatematika extends Buku implements Cetakable, Digitalable {

    public BukuMatematika(String judul, String pengarang) {
        super(judul, pengarang);
    }
    public void cetak() {
        System.out.println("Bunga Mencetak buku matematika dengan " + judul );
    }
    public void membaca() {
        System.out.println("Bunga Membaca buku matematika \"" + judul);
    }
}
