package Jobsheet1;

public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        float price1 = 120000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float price2 = 30000.0f;
        int quantity2 = 1;

        String itemName3 = "Milk";
        float price3 = 25000.0f;
        int quantity3 = 2;

        String itemName4 = "Tea";
        float price4 = 15000.0f;
        int quantity4 = 4;

        System.out.println(itemName1 + ": " + total(price1, quantity1));
        System.out.println(itemName2 + ": " + total(price2, quantity2));
        System.out.println(itemName3 + ": " + total(price3, quantity3));
        System.out.println(itemName4 + ": " + total(price4, quantity4));
    }

    static float total(float price, int quantity) {
        return price * quantity;
    }
}