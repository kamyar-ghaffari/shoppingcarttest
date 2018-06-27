public class Oil extends Product {
    Oil() {
        super("Oil", 2, "Liter");
    }
    public int calculatePrice(ShoppingCart item) {
        return item.getPrice() * item.getCount();
    }
}
