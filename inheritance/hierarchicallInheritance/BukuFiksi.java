package hierarchicallInheritance;

public class BukuFiksi extends Buku {
    

    public BukuFiksi(String judul, String pengarang) {
        super(judul, pengarang);
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: Buku Fiksi");
    }
}