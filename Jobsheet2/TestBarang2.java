package Jobsheet2;

public class TestBarang2 {
    public static void main(String args[]){
        Barang brg1 = new Barang();
        brg1.kode = "B001";
        brg1.namaBarang = "Keyboard Mechanical";
        brg1.hargaDasar = 300000;
        brg1.diskon = 0.1f;

        brg1.tampilData();
    }
}
