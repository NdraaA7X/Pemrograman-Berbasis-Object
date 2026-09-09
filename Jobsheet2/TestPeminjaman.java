package Jobsheet2;

public class TestPeminjaman {
    public static void main(String args[]){
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = 1;
        pinjam1.namaMember = "Ryuu";
        pinjam1.namaGame = "FIFA 24";
        pinjam1.lamaSewa = 3;
        pinjam1.harga = 5000;
        pinjam1.tampilDataPeminjaman();
    }
}
