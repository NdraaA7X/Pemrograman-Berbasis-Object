package Jobsheet4.TugasMandiri;

public class Perpustakaan {
    private String nama;
    private Gedung gedung;
    private Buku[] daftarBuku;
    private int jumlahBuku;

    // COMPOSITION: Gedung dibuat sendiri di dalam constructor
    public Perpustakaan(String nama) {
        this.nama = nama;
        this.gedung = new Gedung();
        this.daftarBuku = new Buku[50];
        this.jumlahBuku = 0;
    }

    // AGGREGATION: Buku diterima dari luar, tidak pernah di-new di sini
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        }
    }

    // DEPENDENCY: BuktiPeminjaman hanya lewat parameter, tidak disimpan
    public void cetakBukti(BuktiPeminjaman bukti) {
        System.out.println(nama + " mencetak bukti peminjaman...");
        bukti.cetak();
    }

    public void infoPerpustakaan() {
        System.out.println("Nama Perpustakaan : " + nama);
        System.out.println("Alamat            : " + gedung.getAlamat());
        System.out.println("Luas Gedung       : " + gedung.getLuas());
        System.out.println("Jumlah Buku       : " + jumlahBuku);
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println(daftarBuku[i].info());
        }
    }
}
