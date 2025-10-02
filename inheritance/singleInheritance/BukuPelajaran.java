public class BukuPelajaran extends Buku { 

    public BukuPelajaran(String judul, String pengarang) {
        super(judul, pengarang);
    }
    
    public void showInfo() {
        System.out.println("Mata Pelajaran: " + super.judul);
        System.out.println("Pengarang: " + super.pengarang);
    }
    public void membaca() {
        System.out.println("Bunga sedang membaca buku yang berjudul \"" + judul + "\" karya " + pengarang + ".");
    }
}

