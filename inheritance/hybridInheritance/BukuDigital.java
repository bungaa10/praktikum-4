package hybridInheritance;

// Interface untuk buku digital
public interface BukuDigital {
    void infoDigital();
    String getFormatFile();
    default void caraBaca() {
        System.out.println("Baca melalui device elektronik");
    }
}
