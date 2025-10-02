package multilevelInheritance;

public class Buku {
    public String judul;
    public String pengarang;

    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        
    }
    
    public void showInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        
    }
    
    public void membaca() {
        System.out.println("Bunga sedang Membaca buku: " + judul);
    }
}