import java.util.ArrayList;

public class Main {
    static Product rice = new Rice();
    static Product milk = new Milk();
    static Product oil = new Oil();

    public static void main(String[] args) {
        Product.productsList.add(rice);
        Product.productsList.add(milk);
        Product.productsList.add(oil);
        AvailableProducts.printList();
    }

}
