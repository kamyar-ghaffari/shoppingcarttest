import java.util.ArrayList;

public class ShoppingCart {
    private String name;
    private int price;
    private int count;
    private String quantityType;
    private ArrayList<Product> cart = new ArrayList<Product>();


    public ShoppingCart(String name, int count, int price, String quantityType) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.quantityType = quantityType;
    }
    public static void printCart() {
        System.out.println(" __________________________________________");
        System.out.println("| Here's the list of your ordered products |");
        System.out.println("|__________________________________________|");
    }
    public String addToCart(Product p){
        return (cart.add(p)) ? "Successfully added " + p.getName() : "Error adding " + p.getName();
    }
    public String removeFromCart(Product p){
        return (cart.remove(p)) ? "Successfully removed " + p.getName() : "Error removing " + p.getName();
    }
}
