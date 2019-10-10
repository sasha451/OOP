package by.courses.java.entity;

import by.courses.java.type.FlowerWrapperType;

import java.util.*;

public class Bouquet {
    private List<AFlower> bouquet;
    private String name;
    private FlowerWrapperType wrapper;

    public Bouquet(String name, FlowerWrapperType wrapper, AFlower... bouquet) {
        this.bouquet = new ArrayList<>(Arrays.asList(bouquet));
        this.name = name;
        this.wrapper = wrapper;
    }

    public Bouquet(String name, FlowerWrapperType wrapper, List<AFlower> bouquet) {
        this.bouquet = bouquet;
        this.name = name;
        this.wrapper = wrapper;
    }

    public void sort(Comparator<? super AFlower> comparator) {
        bouquet.sort(comparator);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + bouquet +
                ",\nname=" + name +
                ", wrapper=" + wrapper +
                '}';
    }

    public List<AFlower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<AFlower> bouquet) {
        this.bouquet = bouquet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowerWrapperType getWrapper() {
        return wrapper;
    }

    public void setWrapper(FlowerWrapperType wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;
        Bouquet bouquet1 = (Bouquet) o;
        return Objects.equals(bouquet, bouquet1.bouquet) &&
                Objects.equals(name, bouquet1.name) &&
                wrapper == bouquet1.wrapper;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bouquet, name, wrapper);
    }
}
