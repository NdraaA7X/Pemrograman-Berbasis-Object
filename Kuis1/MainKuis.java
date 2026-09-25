package Kuis1;

public class MainKuis {
    public static void main(String[] args) {
        Areaparkir area = new Areaparkir("Basement", 5);

        Kendaraan k1 = new Kendaraan("N 1234 AB", "Motor");
        area.parkir(k1, 2);

        Kendaraan k2 = new Kendaraan("L 5678 CD", "Mobil");
        area.parkir(k2, 2);

        Kendaraan k3 = new Kendaraan("W 9999 EF", "Mobil");
        area.parkir(k3, 7);

        area.parkir(k2, 4);

        System.out.print(area.info());
        System.out.println("Slot kosong: " + area.jumlahSlotKosong());

        area.keluar(2);
        System.out.println("Slot kosong: " + area.jumlahSlotKosong());
    }
}
