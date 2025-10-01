package multilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Buku bukuUmum = new Buku("Cara Belajar Efektif", "Dr. Andi");
        System.out.println("1. BUKU :");
        bukuUmum.tampilkanInfo();
        bukuUmum.bacaBuku();
        
        System.out.println("\n2. BUKU PELAJARAN:");
        BukuPelajaran bukuIPA = new BukuPelajaran("IPA Terpadu", "Prof. Budi");
        bukuIPA.tampilkanInfo();
        // bukuIPA.belajar();
        bukuIPA.bacaBuku(); 
        
        System.out.println("\n3. BUKU MATEMATIKA:");
        BukuMatematika bukuMath = new BukuMatematika("Matematika Diskrit","Dr. Citra");
        bukuMath.tampilkanInfo();
        // bukuMath.belajar();       
        bukuMath.bacaBuku();    
        
    }
}