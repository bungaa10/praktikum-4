package multilevelInheritance;

public class BukuMatematika extends BukuPelajaran {
    
    public BukuMatematika(String judul, String pengarang) {
        
        super(judul, pengarang);
    }
    public void membaca() {
        System.out.println("bunga sedang membaca buku " + judul );
    }
    public void infoCetak() {
        System.out.println(String.format("Judul: %s\nPengarang: %s", judul, pengarang));
    }
    
}