package hybridInheritance;

public class BukuDigital extends Buku implements Digitalable {
    public BukuDigital(String judul, String pengarang, double ukuranFile) {
        super(judul, pengarang);
    }
    public void membaca() {
        System.out.println("Bunga Membaca buku digital \"" + judul );
    }
}
