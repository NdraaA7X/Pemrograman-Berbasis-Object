package Jobsheet4.TugasMandiri;

public class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String info() {
        return "Judul: " + judul + "\nPenulis: " + penulis + "\n";
    }
}
