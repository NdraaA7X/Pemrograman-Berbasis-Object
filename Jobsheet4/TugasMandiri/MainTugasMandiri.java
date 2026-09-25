package Jobsheet4.TugasMandiri;

public class MainTugasMandiri {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpus Polinema");

        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer");
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);

        perpus.infoPerpustakaan();

        System.out.println();
        BuktiPeminjaman bukti = new BuktiPeminjaman("TRX-001", "Ryuu");
        perpus.cetakBukti(bukti);
    }
}
