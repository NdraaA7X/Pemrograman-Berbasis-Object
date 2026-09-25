package Jobsheet4.TugasMandiri;

public class Gedung {
    private String alamat;
    private double luas;

    // COMPOSITION: nilai langsung ditetapkan sendiri, tanpa parameter dari luar
    public Gedung() {
        this.alamat = "Jl. Soekarno Hatta No. 9, Malang";
        this.luas = 500.0;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getLuas() {
        return luas;
    }
}
