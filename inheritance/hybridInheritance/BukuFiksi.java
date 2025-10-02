package hybridInheritance;

public class BukuFiksi extends Buku {
    

    public BukuFiksi(String judul, String pengarang) {
        super(judul, pengarang);
    }
    public void showInfo() {
        super.infoBuku();
        System.out.println("Kategori: Buku Fiksi");
    }
}
