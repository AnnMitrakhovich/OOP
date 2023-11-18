import java.util.List;

public class HotProdVendingMashine implements VendingMashine {
    List<HotProduct> hotProducts;

    public HotProdVendingMashine(List<HotProduct> hotProducts) {
       this.hotProducts = hotProducts;
    }
    public List<HotProduct> getHotProducts() {
        return hotProducts;
    }
    public void setHotProducts(List<HotProduct> hotProducts) {
        this.hotProducts = hotProducts;
    }
    @Override
    public Product getProduct(String name) {
        for (HotProduct item : hotProducts) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotProduct item : hotProducts) {
            if (item.getName().equals(name) || item.getVolume() == volume) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume, int temterature) {
        for (HotProduct item : hotProducts) {
            if (item.getName().equals(name) ||
                    item.getVolume() == volume ||
                    item.getTemperature() == temterature) {
                return item;
            }
        }
        return null;
    }

    public void addHotProductToList(HotProduct hotDrink) {
        this.hotProducts.add(hotDrink);
    }
}
