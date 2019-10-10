package by.courses.java;

import by.courses.java.action.BouquetPrice;
import by.courses.java.action.FindFlowers;
import by.courses.java.action.FlowerSortByName;
import by.courses.java.entity.AFlower;
import by.courses.java.entity.AnnualFlower;
import by.courses.java.entity.Bouquet;
import by.courses.java.entity.PerennialFlower;
import by.courses.java.type.ColorType;
import by.courses.java.type.FlowerWrapperType;
import by.courses.java.type.RootType;
import by.courses.java.type.SeedType;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        AFlower flower1 = new AnnualFlower("Cosmea", ColorType.PURPLE, 10, 8, 1, SeedType.SMALL);
        AFlower flower2 = new PerennialFlower("Astra", ColorType.RED, 30, 25, 3, 5, RootType.BULB);
        AFlower flower3 = new PerennialFlower("Narcissus", ColorType.YELLOW, 50, 40, 2, 5, RootType.RHIZOME);
        AFlower flower4 = new AnnualFlower("Petunia", ColorType.GREEN, 40, 12, 1, SeedType.MEDIUM);
        AFlower flower5 = new PerennialFlower("Snowdrops", ColorType.WHITE, 100, 4, 1, 2, RootType.TUBER);

        Bouquet bouquet = new Bouquet("Birthday bouquet", FlowerWrapperType.PAPER, flower1);
        bouquet.getBouquet().add(flower2);
        bouquet.getBouquet().add(flower3);
        bouquet.getBouquet().add(flower4);
        bouquet.getBouquet().add(flower5);
        System.out.println(bouquet + "\n");

        bouquet.getBouquet().sort(new FlowerSortByName());
        System.out.println("Sorted by name:");
        System.out.println(bouquet + "\n");

        int price = 0;
        price = BouquetPrice.summaryPrice(bouquet);
        System.out.println("Bouquet price " + price + "\n");

        List<AFlower> chipFlowers = new ArrayList<>();
        chipFlowers = FindFlowers.findInPriceRange(bouquet, 5, 35);
        System.out.println("Chip flowers(between 5 and 35): "+chipFlowers);
    }
}