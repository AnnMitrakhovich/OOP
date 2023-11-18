public abstract class Product {
    private String name;
    protected double cost;

    public Product() {
        this("<name>", 0);
        // конструктор по умолчанию, прописывается, что создаем в любом случае
    }

    public Product(String name, double cost) {
        this.name = name;
        checkCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length()<=6) {
            this.name = "<name>";
        } else {
            this.name = name;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        checkCost(cost);
    }

    String displayInfoOfProduct() {
        return String.format("%s - %.2f", name, cost);
    }
    private void checkCost(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

}
