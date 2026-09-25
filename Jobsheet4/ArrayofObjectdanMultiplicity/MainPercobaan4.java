package Jobsheet4.ArrayofObjectdanMultiplicity;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        // no.4: coba timpa dengan penumpang baru
        Penumpang budi = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
