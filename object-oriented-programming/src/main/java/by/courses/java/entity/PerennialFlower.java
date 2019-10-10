package by.courses.java.entity;

import by.courses.java.type.ColorType;
import by.courses.java.type.RootType;


import java.util.Objects;

public class PerennialFlower extends AFlower {//многолетники
    private RootType rootSystem;

    public PerennialFlower() {
    }

    public PerennialFlower(String name, ColorType color, int cost, int stemSize, int freshnessLevel, int lifetime, RootType rootSystem) {
        super(name,  color, cost, lifetime, stemSize, freshnessLevel);
        this.rootSystem = rootSystem;
    }

    @Override
    public String toString() {
        return "\nPerennialFlower{" +
                super.toString() + ", "+
                "rootSystem=" + rootSystem +
                "}";
    }

    public RootType getRootSystem() {
        return rootSystem;
    }

    public void setRootSystem(RootType rootSystem) {
        this.rootSystem = rootSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerennialFlower)) return false;
        if (!super.equals(o)) return false;
        PerennialFlower that = (PerennialFlower) o;
        return rootSystem == that.rootSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rootSystem);
    }
}
