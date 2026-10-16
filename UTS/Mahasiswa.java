package UTS;

public class Mahasiswa {
    protected String nim;
    protected String nama;
    protected int sks;
    private Dosen dosenWali;

    public Mahasiswa(String nim, String nama, int sks) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public int hitungUKT() {
        return 150000 * sks;
    }

    public String getJenis() {
        return "Mahasiswa";
    }
}
