public interface VendingMashine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);

    Product getProduct(String name, double volume, int temterature);
}
