package Jobsheet1.Tugas;

public class Handphone extends PerangkatElektronik {
    private String tipe;
    private int jumlahKameraBelakang;

    public Handphone(String merek, int dayaBaterai, String tipe, int jumlahKameraBelakang) {
        super(merek, dayaBaterai);
        this.tipe = tipe;
        this.jumlahKameraBelakang = jumlahKameraBelakang;
    }

    public void putarMusik() {
        System.out.println(getMerek() + " memutar musik lewat speaker.");
    }

    public void screenshot() {
        System.out.println("Layar " + getMerek() + " di-screenshot.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tipe          : " + tipe);
        System.out.println("Kamera Belakang: " + jumlahKameraBelakang + " lensa");
    }
}
