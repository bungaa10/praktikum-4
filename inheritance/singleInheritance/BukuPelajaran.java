public class BukuPelajaran extends Buku { 
    String mataPelajaran;

    public BukuPelajaran(String judul, String pengarang) {
        super(judul, pengarang);
    }
    
    public void infoPelajaran() {
        // showInfo();
        System.out.println("Mata Pelajaran: " + super.judul);
        System.out.println("Pengarang: " + super .pengarang);
    }
}

