package hierarchicallInheritance;

public class Main {
    public static void main(String[] args) {
    BukuFiksi bukuFiksi = new BukuFiksi("Laskar Pelangi", "Andre Hirata");

    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Sejarah Indonesia Modern","Pramoedya Ananta Toer", "Sejarah" );

        
    System.out.println("\nBUKU FIKSI :");
    bukuFiksi.showInfo();
    bukuFiksi.membaca();

    System.out.println("\nBUKU NON-FIKSI :");
    bukuNonFiksi.showInfo();
    bukuNonFiksi.membaca();
    
    }
    }
