public class MainManusia {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Manusia b = new Dosen();
        Manusia c = new Mahasiswa();

        a.bernafas();
        a.makan();

        b.bernafas();
        b.makan();

        c.bernafas();
        c.makan();
    }
}
