package UTS;

public class MahasiswaBeasiswa extends Mahasiswa {
    private int persenBeasiswa;

    public MahasiswaBeasiswa(String nim, String nama, int sks, int persenBeasiswa) {
        super(nim, nama, sks);
        this.persenBeasiswa = persenBeasiswa;
    }

    public int getPersenBeasiswa() {
        return persenBeasiswa;
    }

    @Override
    public int hitungUKT() {
        int totalSebelumDiskon = (150000 * sks) + 500000;
        int diskon = (totalSebelumDiskon * persenBeasiswa) / 100;
        return totalSebelumDiskon - diskon;
    }

    @Override
    public String getJenis() {
        return "Beasiswa " + persenBeasiswa + "%";
    }
}
