package hybridInheritance;

// Kelas dasar atau interface untuk semua jenis buku
public abstract class Buku {
    protected String judul;
    protected String penulis;
    protected double harga;
    
    public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }
    
    // Abstract method yang harus diimplement child class
    public abstract void tampilkanInfo();
    
    // Concrete method
    public void bacaBuku() {
        System.out.println("Membaca buku: " + judul);
    }
    
    // Getter methods
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public double getHarga() { return harga; }
}