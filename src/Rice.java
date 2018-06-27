public class Rice extends Product {
    Rice() {super("Rice", 5, "Kg");}

    public int calculatePrice(ShoppingCart item) {
        return item.getPrice() * item.getCount();
    }
}
