import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* до объявление product абстрактным:
        Product product1 = new Product();
        System.out.println(product1.displayInfoOfProduct());
        Product product2 = new Product("product2", 3);
        System.out.println(product2.displayInfoOfProduct());
        product1.setName("product1");
        product2.setCost(8.5);
        System.out.println(product1.getName());
        System.out.println(product1.displayInfoOfProduct());
        System.out.println(product2.displayInfoOfProduct());
        BottleOfWater bottle1 = new BottleOfWater("bottle1", 5, 0.5);
        System.out.println(bottle1.displayInfoOfProduct());
        // пример полиморфизма
        Product bottle2 = new BottleOfWater("bottle2", 6.50, 1);

        BottleOfWater b1 = new BottleOfWater("Боржоми", 5.00, 0.5);
        BottleOfWater b2 = new BottleOfWater("Святой источник", 3.50, 0.5);
        BottleOfWater b3 = new BottleOfWater("Боржоми", 7.00, 1.0);
        BottleOfWater b4 = new BottleOfWater("Боржоми", 9.00, 1.5);
        BottleOfWater b5 = new BottleOfWater("Святой источник", 6.00, 1.5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        System.out.println(vendingMachine.getProduct("Боржоми")); */

        BottleOfWater b1 = new BottleOfWater("Боржоми", 5.00, 0.5);
        HotProduct h1 = new HotProduct("Capuchino", 5, 0.3, 90);
        HotProduct h2 = new HotProduct("Americano", 4, 0.3, 95);
        HotProdVendingMashine vendingMashine = new HotProdVendingMashine(new ArrayList<>());
        vendingMashine.addHotProductToList(h1);
        vendingMashine.addHotProductToList(h2);

        System.out.println(vendingMashine.getProduct("Capuchino"));
        }

    }
