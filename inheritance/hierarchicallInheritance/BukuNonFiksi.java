package hierarchicallInheritance;

public class BukuNonFiksi extends Buku {
    private String kategori;

    public BukuNonFiksi(String judul, String pengarang, String kategori) {
        super(judul, pengarang);
        this.kategori = kategori;
    }

 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
        
    }

    public String getKategori() {
        return kategori;
    }
}