package multilevelInheritance;

// Program utama untuk demo multilevel inheritance
public class Main {
    public static void main(String[] args) {
        System.out.println("=== MULTILEVEL INHERITANCE DEMO ===\n");
        
        // Membuat objek dari setiap tingkat
        Buku bukuUmum = new Buku("Cara Belajar Efektif", "Dr. Andi", 75000);
        System.out.println("1. BUKU UMUM:");
        bukuUmum.tampilkanInfo();
        bukuUmum.bacaBuku();
        
        System.out.println("\n2. BUKU PELAJARAN:");
        BukuPelajaran bukuIPA = new BukuPelajaran("IPA Terpadu", "Prof. Budi", 90000, 
                                                 "Ilmu Pengetahuan Alam", "SMP");
        bukuIPA.tampilkanInfo();
        bukuIPA.belajar();
        bukuIPA.bacaBuku(); // Method dari kakek (Buku)
        
        System.out.println("\n3. BUKU MATEMATIKA:");
        BukuMatematika bukuMath = new BukuMatematika("Matematika Diskrit", "Dr. Citra", 120000,
                                                   "Universitas", "Diskrit", true);
        bukuMath.tampilkanInfo();
        bukuMath.belajar();     // Method dari ayah (BukuPelajaran)
        bukuMath.hitungSoal();  // Method sendiri
        bukuMath.bacaBuku();    // Method dari kakek (Buku)
        bukuMath.cekKesulitan();
        
        System.out.println("\n=== POLYMORPHISM DEMO ===");
        
        // Polymorphism: BukuMatematika bisa dianggap sebagai Buku
        Buku referensiBuku = bukuMath;
        System.out.println("Via referensi Buku:");
        referensiBuku.tampilkanInfo(); // Akan memanggil override method
        referensiBuku.bacaBuku();
    }
}