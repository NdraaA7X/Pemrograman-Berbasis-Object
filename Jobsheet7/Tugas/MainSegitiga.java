public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total Sudut (1 sudut) : " + s.totalSudut(60));
        System.out.println("Total Sudut (2 sudut) : " + s.totalSudut(60, 40));
        System.out.println("Keliling (3 sisi)     : " + s.keliling(3, 4, 5));
        System.out.println("Keliling (sisi miring): " + s.keliling(3, 4));
    }
}
