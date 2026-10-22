package UTS;

public class BagianKeuangan {
    private String nama;

    public BagianKeuangan(String nama) {
        this.nama = nama;
    }

    public void cetakTagihan(Mahasiswa m) {
        if (m == null) return;
        String namaWali = (m.getDosenWali() != null) ? m.getDosenWali().getNama() : "-";
        System.out.println("Tagihan UKT " + m.getNama() + " (" + m.getJenis() + ") - Wali: " + namaWali + " : " + m.hitungUKT());
    }
}
