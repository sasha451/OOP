package by.courses.java.action;

import by.courses.java.entity.AFlower;
import java.util.Comparator;

public class FlowerSortByColor implements Comparator<AFlower> {
    @Override
    public int compare(AFlower o1, AFlower o2) {
        return o1.getColor().toString().compareTo(o2.getColor().toString());
    }
}


