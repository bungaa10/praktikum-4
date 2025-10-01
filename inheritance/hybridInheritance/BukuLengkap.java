package hybridInheritance;

// Hybrid class - mewarisi dari BukuPelajaran dan mengimplementasikan kedua interface
public class BukuLengkap extends BukuPelajaran implements BukuCetak, BukuDigital {
    private int jumlahHalaman;
    private String formatFile;
    private boolean tersediaCetak;
    private boolean tersediaDigital;
    
    public BukuLengkap(String judul, String penulis, double harga,
                      String mataPelajaran, String tingkat,
                      int jumlahHalaman, String formatFile,
                      boolean tersediaCetak, boolean tersediaDigital) {
        super(judul, penulis, harga, mataPelajaran, tingkat);
        this.jumlahHalaman = jumlahHalaman;
        this.formatFile = formatFile;
        this.tersediaCetak = tersediaCetak;
        this.tersediaDigital = tersediaDigital;
    }
    
    // Implementasi BukuCetak interface
    @Override
    public void infoCetak() {
        if (tersediaCetak) {
            System.out.println("Buku cetak: " + judul + " - " + jumlahHalaman + " halaman");
        } else {
            System.out.println("Buku " + judul + " tidak tersedia dalam format cetak");
        }
    }
    
    @Override
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
    
    // Implementasi BukuDigital interface
    @Override
    public void infoDigital() {
        if (tersediaDigital) {
            System.out.println("Buku digital: " + judul + " - Format: " + formatFile);
        } else {
            System.out.println("Buku " + judul + " tidak tersedia dalam format digital");
        }
    }
    
    @Override
    public String getFormatFile() {
        return formatFile;
    }
    
    // Override caraBaca untuk menghindari diamond problem
    @Override
    public void caraBaca() {
        if (tersediaCetak && tersediaDigital) {
            System.out.println("Bisa dibaca secara fisik atau digital");
        } else if (tersediaCetak) {
            BukuCetak.super.caraBaca();
        } else if (tersediaDigital) {
            BukuDigital.super.caraBaca();
        }
    }
    
    // Override method dari BukuPelajaran
    @Override
    public void tampilkanInfo() {
        System.out.println("=== BUKU LENGKAP HYBRID ===");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Tingkat: " + tingkat);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Format Digital: " + formatFile);
        System.out.println("Tersedia Cetak: " + (tersediaCetak ? "Ya" : "Tidak"));
        System.out.println("Tersedia Digital: " + (tersediaDigital ? "Ya" : "Tidak"));
    }
    
    // Method khusus hybrid class
    public void tampilkanSemuaFitur() {
        System.out.println("\n=== SEMUA FITUR BUKU LENGKAP ===");
        tampilkanInfo();
        infoCetak();
        infoDigital();
        caraBaca();
        belajar();
        bacaBuku();
    }
}
