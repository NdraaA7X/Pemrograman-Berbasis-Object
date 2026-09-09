package Jobsheet2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double harga;

    public double hitungHargaBayar(){
        double hargaBayar = lamaSewa * harga;
        return hargaBayar;
    }

    public void tampilDataPeminjaman(){
        System.out.println("Id           : "+id);
        System.out.println("Nama Member  : "+namaMember);
        System.out.println("Nama Game    : "+namaGame);
        System.out.println("Lama Sewa    : "+lamaSewa+" hari");
        System.out.println("Harga Bayar  : "+hitungHargaBayar());
    }
}
