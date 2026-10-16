package UTS;

public class Jurusan {
    private String nama;
    private Laboratorium[] daftarLab;
    private Dosen kajur;

    public Jurusan(String nama, int jumlahLab, int kapasitasLab) {
        this.nama = nama;
        this.daftarLab = new Laboratorium[jumlahLab];
        for (int i = 0; i < jumlahLab; i++) {
            this.daftarLab[i] = new Laboratorium("LAB-" + (i + 1), kapasitasLab);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setKajur(Dosen kajur) {
        this.kajur = kajur;
    }

    public Dosen getKajur() {
        return kajur;
    }

    public void daftarPraktikum(Mahasiswa m) {
        if (m == null) return;
        boolean berhasil = false;
        for (Laboratorium lab : daftarLab) {
            if (lab != null && !lab.isPenuh()) {
                lab.tambahPeserta(m);
                berhasil = true;
                break;
            }
        }
        if (!berhasil) {
            System.out.println("Semua lab penuh, " + m.getNama() + " tidak dapat didaftarkan.");
        }
    }

    public void daftarPraktikum(Mahasiswa m, int nomorLab) {
        if (m == null) return;
        int index = nomorLab - 1;
        if (index < 0 || index >= daftarLab.length || daftarLab[index] == null) {
            System.out.println("Nomor lab tidak valid!");
            return;
        }

        Laboratorium lab = daftarLab[index];
        if (lab.isPenuh()) {
            System.out.println(lab.getKode() + " penuh, " + m.getNama() + " tidak dapat didaftarkan.");
        } else {
            lab.tambahPeserta(m);
        }
    }

    public void tampilInfo() {
        for (Laboratorium lab : daftarLab) {
            if (lab != null) {
                lab.tampilPeserta();
            }
        }
    }
}
