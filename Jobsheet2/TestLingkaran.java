package Jobsheet2;

public class TestLingkaran {
    public static void main(String args[]){
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.phi = 3.14;
        lingkaran1.r = 7;

        System.out.println("Luas Lingkaran     : "+lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran : "+lingkaran1.hitungKeliling());
    }
}
