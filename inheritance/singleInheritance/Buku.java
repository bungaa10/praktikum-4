public class Buku {

    String judul;
    String pengarang;

    Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    void showInfo() {
        System.out.println("Judul: " + judul );
        System.out.println("Pengarang: " + pengarang);
    }
    public void membaca() {
        System.out.println("Bunga sedang membaca buku yang berjudul \"" + judul + "\" karya " + pengarang + ".");
    }
}   
