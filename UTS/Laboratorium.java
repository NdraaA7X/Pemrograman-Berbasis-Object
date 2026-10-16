package UTS;

public class Laboratorium {
    private String kode;
    private Mahasiswa[] peserta;
    private int jumlah;

    public Laboratorium(String kode, int kapasitas) {
        this.kode = kode;
        this.peserta = new Mahasiswa[kapasitas];
        this.jumlah = 0;
    }

    public String getKode() {
        return kode;
    }

    public boolean isPenuh() {
        return jumlah >= peserta.length;
    }

    public boolean tambahPeserta(Mahasiswa m) {
        if (m == null || isPenuh()) {
            return false;
        }
        peserta[jumlah] = m;
        jumlah++;
        return true;
    }

    public void tampilPeserta() {
        System.out.print(kode + ": ");
        for (int i = 0; i < jumlah; i++) {
            if (peserta[i] != null) {
                System.out.print(peserta[i].getNama());
                if (i < jumlah - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
