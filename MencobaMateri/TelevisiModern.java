public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    // Konstruktor
    public TelevisiModern(String mrk, int channelCount) {
        // Memanggil konstruktor superclass (Televisi)
        super(mrk, channelCount); 
        this.dvd = "kosong"; // Default status DVD awal
    }

    // Method untuk mengganti modus tampilan
    public void gantiModusTampilan(String mode) {
        this.displayMode = mode;
    }

    // Method untuk mengetahui modus tampilan saat ini
    public String getDisplayMode() {
        return displayMode;
    }

    // Method untuk memasukkan DVD
    public void masukkanDVD(String dvdTitle) {
        this.dvd = dvdTitle;
    }

    // Method untuk memainkan DVD
    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }
}