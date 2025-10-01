package hybridInheritance;

// Program demo untuk hybrid inheritance
public class DemoHybridInheritance {
    public static void main(String[] args) {
        System.out.println("=== DEMO HYBRID INHERITANCE ===\n");
        
        // Membuat objek hierarchical inheritance
        System.out.println("1. HIERARCHICAL INHERITANCE:");
        BukuPelajaran bukuPelajaran = new BukuPelajaran(
            "Matematika Dasar", "Prof. Ahmad", 80000, "Matematika", "SMP"
        );
        bukuPelajaran.tampilkanInfo();
        bukuPelajaran.belajar();
        
        System.out.println("\n2. HIERARCHICAL INHERITANCE LAIN:");
        BukuReferensi bukuReferensi = new BukuReferensi(
            "Kamus Bahasa Indonesia", "Tim Penyusun", 120000, "Bahasa", true
        );
        bukuReferensi.tampilkanInfo();
        bukuReferensi.referensi();
        
        System.out.println("\n3. HYBRID INHERITANCE:");
        BukuLengkap bukuHybrid = new BukuLengkap(
            "Pemrograman Java Komprehensif", 
            "Budi Santoso", 
            150000,
            "Informatika", 
            "Universitas",
            450, 
            "PDF/EPUB",
            true, 
            true
        );
        
        bukuHybrid.tampilkanSemuaFitur();
        
        System.out.println("\n4. POLYMORPHISM DENGAN HYBRID:");
        // Polymorphism dengan interface
        BukuCetak sebagaiCetak = bukuHybrid;
        BukuDigital sebagaiDigital = bukuHybrid;
        BukuPelajaran sebagaiPelajaran = bukuHybrid;
        
        System.out.println("Sebagai BukuCetak:");
        sebagaiCetak.infoCetak();
        
        System.out.println("Sebagai BukuDigital:");
        sebagaiDigital.infoDigital();
        
        System.out.println("Sebagai BukuPelajaran:");
        sebagaiPelajaran.tampilkanInfo();
        
        System.out.println("\n5. HYBRID BOOK VARIASI:");
        BukuLengkap bukuDigitalOnly = new BukuLengkap(
            "Struktur Data Modern",
            "Dr. Citra",
            95000,
            "Ilmu Komputer",
            "SMA",
            300,
            "PDF",
            false,
            true
        );
        bukuDigitalOnly.tampilkanSemuaFitur();
    }
}