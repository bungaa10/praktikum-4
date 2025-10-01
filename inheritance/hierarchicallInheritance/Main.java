package hierarchicallInheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM INFORMASI PERPUSTAKAAN ===\n");

        
    BukuFiksi bukuFiksi = new BukuFiksi("Laskar Pelangi", "Andre Hirata");

    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Sejarah Indonesia Modern","Pramoedya Ananta Toer", "Sejarah" );

    BukuPelajaran bukuPelajaran = new BukuPelajaran("Matematika SMA Kelas 10", "Budi Santoso","Pendidikan","Matematika", 10
        );

    Novel novel = new Novel("Bumi", "Tere Liye", "Fantasi", 440
        );

        
    System.out.println("=== BUKU FIKSI ===");
    bukuFiksi.displayInfo();

    System.out.println("=== BUKU NON-FIKSI ===");
    bukuNonFiksi.displayInfo();

    System.out.println("=== BUKU PELAJARAN ===");
    bukuPelajaran.displayInfo();

    System.out.println("=== NOVEL ===");
    novel.displayInfo();

    }
    }
