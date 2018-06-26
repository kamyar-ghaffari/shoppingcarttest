public abstract class Product {
    private String name;
    private int price;
    private int availableCount;
    private String quantityType;
    public abstract int calculatePrice(ShoppingCart item);

    public Product(){
        this("", 0, 0, "");
    }
    Product(String name, int price, int availableCount, String quantityType) {
        this.name = name;
        this.price = price;
        this.availableCount = availableCount;
        this.quantityType = quantityType;
    }
    int getPrice() {
        return price;
    }

    public String getQuantityType() {
        return quantityType;
    }
    public String getName() {
        return name;
    }
    int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }
}
