import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private String name;
    private int price;
    private int count;
    private String quantityType;

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getQuantityType() {
        return quantityType;
    }

    private static ArrayList<ShoppingCart> cart = new ArrayList<ShoppingCart>();
    private static Scanner input = new Scanner(System.in);
    private static int totalPrice;
    private static int getTotal() {
        totalPrice = 0;

        for (ShoppingCart s: cart) {
            totalPrice = totalPrice + Product.calculatePrice(s);
        }
        return totalPrice;
    }


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
        System.out.println();

        for (ShoppingCart s: cart) {

            System.out.println(s.getCount() + " " + s.getQuantityType() + "s  of " + s.getName() + "         price: " + Product.calculatePrice(s));
        }
        System.out.println("TOTAL PRICE: " + getTotal());
        System.out.println();
        System.out.println();
        System.out.println("if you want to remove a product from your cart enter the name of product,");
        System.out.println("if you want to add more items enter ' add ' ,");
        System.out.println("if you want to finalize your shopping enter ' end '");
        String answer = input.nextLine();
        if (answer.equals("add")) {
            AvailableProducts.printList();
        } else if (answer.equals("end")) {
            System.out.println("OK, this is the end of shopping actually and the rest should be payment which i don't have, so goodbye!!");
            System.exit(0);
        } else {
            remove(answer);
        }
    }
    public static void addToCart(ShoppingCart p){
        cart.add(p);
        getTotal();
    }
    public static void remove(String name) {
        for (ShoppingCart s: cart) {
            String  proName = s.getName();
            if (name.equals(proName)) {
                removeFromCart(s);
            } else {
                // don't know
            }
        }
    }
    public static void removeFromCart(ShoppingCart p){
        cart.remove(p);
        getTotal();
        printCart();
    }
}
