package Jobsheet2;

public class TestArray {
    public static void main(String args[]){
        int[] angka = {1,2,3};

        System.out.println("Awal Program");
        try{
            System.out.println(angka[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("error karena index array tidak ditemukan");
        }
        System.out.println("Akhir Program");
    }
}
