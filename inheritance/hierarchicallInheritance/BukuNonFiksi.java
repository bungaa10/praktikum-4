package hierarchicallInheritance;

public class BukuNonFiksi extends Buku {

    public BukuNonFiksi(String judul, String pengarang, String kategori) {
        super(judul, pengarang);
    }
    public void showInfo() {
        super.showInfo();
        
    }
}