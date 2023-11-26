package OOPHW.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOFWater("qwe", 123, 100));
        productList.add(new BottleOFWater("qwe", 200, 150));
        productList.add(new BottleOFWater("zxcg", 500, 1000));
        productList.add(new BottleOFWater("qaffwe", 123, 10));
        productList.add(new HotDrink("qhwe", 323, 150, 83));
        productList.add(new HotDrink("gght", 250, 200, 83));
        productList.add(new HotDrink("yuyu", 320, 200, 75));
        productList.add(new HotDrink("rthu", 510, 350, 75));
        BottleOfWaterVendingMachine bottleOfWaterVendingMachine = new BottleOfWaterVendingMachine();
        bottleOfWaterVendingMachine.initProduct(productList);
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProduct(productList);
        System.out.println(bottleOfWaterVendingMachine.getProduct("qwe", 150));
        System.out.println(hotDrinkVendingMachine.getProduct("gght", 83));
    }
}