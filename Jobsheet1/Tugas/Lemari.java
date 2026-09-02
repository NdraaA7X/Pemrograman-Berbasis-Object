package Jobsheet1.Tugas;

public class Lemari {
    private int jumlahPintu;
    private int jumlahStiker;

    public Lemari(int jumlahPintu, int jumlahStiker) {
        this.jumlahPintu = jumlahPintu;
        this.jumlahStiker = jumlahStiker;
    }

    public void tempelStiker() {
        jumlahStiker++;
        System.out.println("Stiker baru ditempel, total sekarang " + jumlahStiker + ".");
    }

    public void kunciLemari() {
        System.out.println("Lemari dikunci.");
    }

    public void printInfo() {
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Jumlah Stiker: " + jumlahStiker);
    }
}
