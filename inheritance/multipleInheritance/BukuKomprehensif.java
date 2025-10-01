package multipleInheritance;

// Child class yang mewarisi kedua parent interface
public class BukuKomprehensif implements BukuCetak, BukuDigital {
    private String judul;
    private int halaman;
    private String format;
    
    // Constructor
    public BukuKomprehensif(String judul, int halaman, String format) {
        this.judul = judul;
        this.halaman = halaman;
        this.format = format;
    }
    
    // Implementasi methods dari BukuCetak
    @Override
    public void infoCetak() {
        System.out.println("Buku cetak: " + judul + " - " + halaman + " halaman");
    }
    
    @Override
    public int getHalaman() {
        return halaman;
    }
    
    // Implementasi methods dari BukuDigital
    @Override
    public void infoDigital() {
        System.out.println("Buku digital: " + judul + " - Format: " + format);
    }
    
    @Override
    public String getFormat() {
        return format;
    }
    
    // Method khusus child class
    public void tampilkanSemuaInfo() {
        System.out.println("=== INFO LENGKAP BUKU ===");
        infoCetak();
        infoDigital();
        System.out.println("Judul: " + judul);
        System.out.println("Total halaman: " + halaman);
        System.out.println("Format digital: " + format);
    }
}