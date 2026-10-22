package UTS;

public class MainVarianN {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("Teknologi Informasi", 2, 2);
        Dosen kajur = new Dosen("19750101", "Pak Imam");
        jurusan.setKajur(kajur);

        Dosen wali = new Dosen("19800202", "Bu Vivi");

        Mahasiswa m1 = new MahasiswaReguler("2341720001", "Lestari", 20);
        m1.setDosenWali(wali);
        
        Mahasiswa m2 = new MahasiswaBeasiswa("2341720002", "Usman", 24, 50);
        m2.setDosenWali(wali);
        
        Mahasiswa m3 = new MahasiswaReguler("2341720003", "Anugrah", 22);
        m3.setDosenWali(wali);
        
        Mahasiswa m = new MahasiswaBeasiswa("2341720899", "Mentari", 20, 25);
        System.out.println("UKT Mentari: " + m.hitungUKT());

        BagianKeuangan bk = new BagianKeuangan("Bagian Keuangan");
        bk.cetakTagihan(m1);
        bk.cetakTagihan(m2);
        bk.cetakTagihan(m3);

        jurusan.daftarPraktikum(m1);
        jurusan.daftarPraktikum(m2);
        jurusan.daftarPraktikum(m3);
        jurusan.daftarPraktikum(m3, 1);

        jurusan.tampilInfo();
    }
}
