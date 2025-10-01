package hierarchicallInheritance;

public class BukuPelajaran extends BukuNonFiksi {
    private String mataPelajaran;
    private int tingkatKelas;

    public BukuPelajaran(String judul, String pengarang, String kategori,
                        String mataPelajaran, int tingkatKelas) {
        super(judul, pengarang, kategori);
        this.mataPelajaran = mataPelajaran;
        this.tingkatKelas = tingkatKelas;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Tingkat Kelas: " + tingkatKelas);
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
}
}
