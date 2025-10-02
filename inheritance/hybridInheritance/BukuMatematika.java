package hybridInheritance;

public class BukuMatematika extends Buku implements Cetakable, Digitalable {

    public BukuMatematika(String judul, String pengarang) {
        super(judul, pengarang);
    }
    public void cetak() {
        System.out.println("Mencetak buku komprehensif dengan " + judul );
    }
    public void membaca() {
        System.out.println("Membaca buku komprehensif \"" + judul);
    }
}
