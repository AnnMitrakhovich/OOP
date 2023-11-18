public class HotProduct extends BottleOfWater{
    private int temperature;

    public HotProduct(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "HotProduct {" +
                "name = " + super.getName() +
                ";volume = " + super.getVolume() +
                ";cost = " + super.getCost() +
                ";temperature = " + temperature +
                '}';
    }
}
