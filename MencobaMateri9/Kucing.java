package MencobaMateri9;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    public void bergerak(){
        System.out.println(nama + " berjalan dengan langkah ringan.");
    }
}
