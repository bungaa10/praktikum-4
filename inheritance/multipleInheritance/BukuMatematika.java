package multipleInheritance;

public class BukuMatematika implements BukuCetak{
    String judul;
    String pengarang;
    
    public BukuMatematika(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public void membaca() {
        System.out.println("bunga sedang membaca buku " + judul );
    }
    public void infoCetak() {
        System.out.println(String.format("Judul: %s\nPengarang: %s", judul, pengarang));
    }
    public int getHalaman() {
        return 100; // Return the number of pages or implement your logic here
    }
}