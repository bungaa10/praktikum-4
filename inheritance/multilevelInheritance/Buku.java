package multilevelInheritance;

// Kelas dasar/parent tertinggi
public class Buku {
    protected String judul;
    protected String penulis;
    protected double harga;
    
    public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Harga: Rp " + harga);
    }
    
    public void bacaBuku() {
        System.out.println("Membaca buku: " + judul);
    }
}