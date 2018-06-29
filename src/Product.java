import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private String quantityType;
    private int number;
    public static int calculatePrice(ShoppingCart item) {
        return item.getPrice() * item.getCount();
    }

    public Product(){
        this("", 0, "", 0);
    }
    static ArrayList<Product> productsList = new ArrayList<Product>();
    Product(String name, int price, String quantityType, int number) {
        this.name = name;
        this.price = price;
        this.quantityType = quantityType;
        this.number = number;

    }
    int getPrice() {
        return price;
    }
    int getNumber() {
        return number;
    }

    public String getQuantityType() {
        return quantityType;
    }
    public String getName() {
        return name;
    }

}
