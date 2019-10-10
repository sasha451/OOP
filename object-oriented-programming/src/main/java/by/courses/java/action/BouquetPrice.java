package by.courses.java.action;

import by.courses.java.entity.AFlower;
import by.courses.java.entity.Bouquet;

public class BouquetPrice {

    public static int summaryPrice(Bouquet flowers) {
        int price = 0;
        for (AFlower flag : flowers.getBouquet()) {
            price += flag.getCost();
        }
        return price;
    }
}
