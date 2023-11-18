public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, double cost, double volume) {
        super(name,cost);
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    String displayInfoOfProduct() {
        return String.format("Бутылка с водой - \nцена - %.2f объемом %.1f", cost, volume);
    }
    public String toString() {
        return "BottleOfWatter {" +
                "name = " + super.getName() +
                ";volume = " + volume +
                ";cost = " + super.getCost() +
                '}';
    }
}
