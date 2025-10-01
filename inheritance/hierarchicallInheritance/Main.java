package hierarchicallInheritance;

public class Main {
    public static void main(String[] args) {
    BukuFiksi bukuFiksi = new BukuFiksi("Laskar Pelangi", "Andre Hirata");

    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Sejarah Indonesia Modern","Pramoedya Ananta Toer", "Sejarah" );

    BukuPelajaran bukuPelajaran = new BukuPelajaran("Matematika SMA Kelas 10", "Budi Santoso","Pendidikan","Matematika", 10
        );

    Novel novel = new Novel("Bumi", "Tere Liye", "Fantasi", 440
        );

        
    System.out.println("\nBUKU FIKSI :");
    bukuFiksi.displayInfo();

    System.out.println("\nBUKU NON-FIKSI :");
    bukuNonFiksi.displayInfo();

    System.out.println("\nBUKU PELAJARAN :");
    bukuPelajaran.displayInfo();

    System.out.println("\nNOVEL :");
    novel.displayInfo();

    }
    }
