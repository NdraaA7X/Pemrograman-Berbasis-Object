package Jobsheet4.TugasMandiri;

public class BuktiPeminjaman {
    private String noTransaksi;
    private String namaPeminjam;

    public BuktiPeminjaman(String noTransaksi, String namaPeminjam) {
        this.noTransaksi = noTransaksi;
        this.namaPeminjam = namaPeminjam;
    }

    public void cetak() {
        System.out.println("=== BUKTI PEMINJAMAN ===");
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("Peminjam     : " + namaPeminjam);
        System.out.println("========================");
    }
}
