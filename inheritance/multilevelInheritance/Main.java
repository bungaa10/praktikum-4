package multilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Buku bukuUmum = new Buku("Cara Belajar Efektif", "Dr. Andi");
        System.out.println("BUKU:");
        bukuUmum.showInfo();
        bukuUmum.membaca();
        
        System.out.println("\nBUKU PELAJARAN:");
        BukuPelajaran bukuIPA = new BukuPelajaran("IPA Terpadu", "Prof. Budi");
        bukuIPA.showInfo();
        bukuIPA.membaca(); 
        
        System.out.println("\nBUKU MATEMATIKA:");
        BukuMatematika bukuMath = new BukuMatematika("Matematika Diskrit","Dr. Citra");
        bukuMath.showInfo();       
        bukuMath.membaca();    
        
    }
}