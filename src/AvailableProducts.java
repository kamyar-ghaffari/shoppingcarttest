import java.util.Scanner;

public class AvailableProducts {
    public static void printList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Here's the list of available products: ");
        System.out.println();
        for (Product p: Product.productsList) {
            int pNumber = p.getNumber();
            String pName = p.getName();
            String pQuantityType = p.getQuantityType();
            int pPrice = p.getPrice();
            System.out.println(pName + "   " + pPrice + "   " + pQuantityType);
        }
        System.out.println("Please enter the number of the product you're willing to add to cart, ");
        System.out.println("or simply enter 0 to open shopping cart.");
        int item = input.nextInt();
        if (item == 0){
            ShoppingCart.printCart();
        } else {
            System.out.println("please enter the desired quantity of the product: ");
            int quantity = input.nextInt();
            String itemName = nameGet(item);
            int price = priceGet(item);
            String qType = qTypeGet(item);
            add(itemName, quantity, price, qType);
        }
    }
    private static String qTypeGet(int number) {
        for (Product p: Product.productsList) {
            if (p.getNumber() == number) {
                return p.getQuantityType();
            }
        }
        return null;
    }
    private static int priceGet(int number) {
        for (Product p: Product.productsList) {
            if (p.getNumber() == number) {
                return p.getPrice();
            }
        }
        return 0;
    }
    private static String nameGet(int number) {
        for (Product p: Product.productsList) {
            if (p.getNumber() == number) {
                return p.getName();
            }
        }
        return null;
    }
    private static void add(String itemName, int quantity, int price, String qType) {
        ShoppingCart objName = new ShoppingCart(itemName, quantity, price, qType);
        ShoppingCart.addToCart(objName);
        printList();
    }

}
