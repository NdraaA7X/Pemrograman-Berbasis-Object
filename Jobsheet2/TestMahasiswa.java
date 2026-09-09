package Jobsheet2;

public class TestMahasiswa {
    public static void main(String args[]){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Hendra";
        mhs1.alamat = "Jl. Pisang Kipas No. 59";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Budi";
        mhs2.alamat = "Jl. Merdeka No 5";
        mhs2.kelas = "2B";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Sari";
        mhs3.alamat = "Jl. Kartini No 12";
        mhs3.kelas = "2C";
        mhs3.tampilBiodata();
    }
}
