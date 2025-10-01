package multipleInheritance;

// Program utama untuk demo multiple inheritance
public class Main {
    public static void main(String[] args) {
        // Membuat objek buku yang memiliki kedua sifat (cetak dan digital)
        BukuKomprehensif buku = new BukuKomprehensif(
            "Pemrograman Java untuk Pemula", 
            350, 
            "PDF"
        );
        
        // Menampilkan semua info
        buku.tampilkanSemuaInfo();
        
        System.out.println("\n=== AKSES MELALUI INTERFACE ===");
        
        // Polymorphism - akses melalui interface BukuCetak
        BukuCetak sebagaiCetak = buku;
        sebagaiCetak.infoCetak();
        System.out.println("Jumlah halaman: " + sebagaiCetak.getHalaman());
        
        // Polymorphism - akses melalui interface BukuDigital
        BukuDigital sebagaiDigital = buku;
        sebagaiDigital.infoDigital();
        System.out.println("Format file: " + sebagaiDigital.getFormat());
        
        System.out.println("\n=== CONTOH LAIN ===");
        
        // Membuat buku lain
        BukuKomprehensif buku2 = new BukuKomprehensif(
            "Struktur Data dan Algoritma Java", 
            500, 
            "EPUB"
        );
        
        buku2.tampilkanSemuaInfo();
    }
}