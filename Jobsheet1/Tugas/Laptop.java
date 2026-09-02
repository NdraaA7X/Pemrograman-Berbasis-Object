package Jobsheet1.Tugas;

public class Laptop extends PerangkatElektronik {
    private String tipe;
    private int ramGb;

    public Laptop(String merek, int dayaBaterai, String tipe, int ramGb) {
        super(merek, dayaBaterai);
        this.tipe = tipe;
        this.ramGb = ramGb;
    }

    public void bukaTerminal() {
        System.out.println("Terminal dibuka di " + getMerek() + ".");
    }

    public void tutupLayar() {
        System.out.println(getMerek() + " ditutup, masuk sleep mode.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tipe          : " + tipe);
        System.out.println("RAM           : " + ramGb + " GB");
    }
}