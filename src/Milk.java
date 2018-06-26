public class Milk extends Product {
    Milk() {
        super("Milk", 5, 20, "Packet");
    }
    public int calculatePrice(ShoppingCart item) {
        return item.getPrice() * item.getCount();
    }
}
