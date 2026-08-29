package Jobsheet1;

class Product {

    private final String iteName;
    private final float price;

    public Product (String itemName, float price) {
        this.iteName = itemName;
        this.price = price;
    }

    public float total (int quantity) {
        return price * quantity;
    }

    public String getName() {
        return iteName;
    }
}

public class OOP {

    public static void main(String[] args) {

        Product product1 = new Product("Coffee", 12000.0f);
        Product product2 = new Product("Sugar", 3000.0f);

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
        }
    }