package by.courses.java.entity;

import by.courses.java.type.ColorType;
import by.courses.java.type.SeedType;
import java.util.Objects;

public class AnnualFlower extends AFlower {//однолетники
    private SeedType seed;

    public AnnualFlower() {
    }

    public AnnualFlower(String name, ColorType color, int cost, int stemSize, int freshnessLevel, SeedType seed) {
        super(name, color, cost, stemSize, freshnessLevel);
        this.seed = seed;
        setLifetime(1);
    }

    public SeedType getSeed() {
        return seed;
    }

    public void setSeed(SeedType seed) {
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "\nAnnualFlower{" +
                super.toString() + ", " +
                "seed=" + seed +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnnualFlower)) return false;
        if (!super.equals(o)) return false;
        AnnualFlower that = (AnnualFlower) o;
        return seed == that.seed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seed);
    }
}
