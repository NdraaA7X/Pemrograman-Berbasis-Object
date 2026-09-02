package Jobsheet1.Tugas;

public class DemoTugas {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone("Realme 9", 85, "Smartphone", 3);
        hp1.cekBaterai();
        hp1.putarMusik();
        hp1.screenshot();
        hp1.printInfo();
        System.out.println();

        Laptop laptop1 = new Laptop("HP Victus", 60, "Laptop Gaming", 16);
        laptop1.cekBaterai();
        laptop1.bukaTerminal();
        laptop1.charge(20);
        laptop1.printInfo();
        System.out.println();

        RiceCooker riceCooker1 = new RiceCooker("Ungu", 1.8);
        riceCooker1.masakNasi();
        riceCooker1.cabutKabel();
        riceCooker1.printInfo();
        System.out.println();

        Lemari lemari1 = new Lemari(2, 5);
        lemari1.tempelStiker();
        lemari1.kunciLemari();
        lemari1.printInfo();
    }
}
