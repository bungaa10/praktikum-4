package hierarchicallInheritance;

public class Novel extends BukuFiksi {
    private String Genre;
    private int jumlahHalaman;

    public Novel(String judul, String pengarang, String Genre, int jumlahHalaman) {
        super(judul, pengarang);
        this.Genre = Genre;
        this.jumlahHalaman = jumlahHalaman;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + Genre);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Jenis: Novel");
    }

    public String getSubGenre() {
        return Genre;
    }

    public void setSubGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}
