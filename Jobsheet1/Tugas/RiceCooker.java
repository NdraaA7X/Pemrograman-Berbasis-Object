package Jobsheet1.Tugas;

public class RiceCooker {
    private String warna;
    private double kapasitasLiter;

    public RiceCooker(String warna, double kapasitasLiter) {
        this.warna = warna;
        this.kapasitasLiter = kapasitasLiter;
    }

    public void masakNasi() {
        System.out.println("Rice cooker warna " + warna + " sedang memasak nasi.");
    }

    public void cabutKabel() {
        System.out.println("Kabel rice cooker dicabut.");
    }

    public void printInfo() {
        System.out.println("Warna       : " + warna);
        System.out.println("Kapasitas   : " + kapasitasLiter + " liter");
    }
}
