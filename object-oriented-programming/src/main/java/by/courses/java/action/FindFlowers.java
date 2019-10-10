package by.courses.java.action;

import by.courses.java.entity.AFlower;
import by.courses.java.entity.Bouquet;
import java.util.ArrayList;
import java.util.List;

public class FindFlowers {
    public static List<AFlower> findInPriceRange(Bouquet flowers, int minCost, int maxCost) {
        List<AFlower> tempList = new ArrayList<>();
        for (AFlower temp : flowers.getBouquet()) {
            if (temp.getCost() > minCost && temp.getCost() < maxCost)
                tempList.add(temp);
        }
        return tempList;
    }
}
