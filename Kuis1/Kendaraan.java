package Kuis1;

public class Kendaraan {
    private String platNomor;
    private String Jenis;

    public Kendaraan(String platNomor, String Jenis) {
        this.platNomor = platNomor;
        this.Jenis = Jenis;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return Jenis;
    }

     public String info() {
        return platNomor + " - " + Jenis;
    }
}
