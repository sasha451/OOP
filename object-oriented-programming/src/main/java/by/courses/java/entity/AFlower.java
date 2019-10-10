package by.courses.java.entity;

import by.courses.java.type.ColorType;

import java.util.Objects;

public abstract class AFlower {
    private String name;
    private int cost;
    private int stemSize;
    private int lifetime;
    private int freshnessLevel;
    private ColorType color;

    public AFlower(){}

    public AFlower(String name, ColorType color, int cost, int stemSize, int freshnessLevel) {
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.stemSize = stemSize;
        this.freshnessLevel = freshnessLevel;
    }

    public AFlower(String name, ColorType color, int cost, int lifetime, int stemSize, int freshnessLevel) {
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.lifetime = lifetime;
        this.stemSize = stemSize;
        this.freshnessLevel = freshnessLevel;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStemSize() {
        return stemSize;
    }

    public void setStemSize(int stemSize) {
        this.stemSize = stemSize;
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", cost=" + cost +
                ", stemSize=" + stemSize +
                ", lifetime=" + lifetime +
                ", freshnessLevel=" + freshnessLevel +
                ", color=" + color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lifetime, cost, stemSize, color, freshnessLevel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AFlower)) return false;
        AFlower flower = (AFlower) o;
        return lifetime == flower.lifetime &&
                cost == flower.cost &&
                stemSize == flower.stemSize &&
                freshnessLevel == flower.freshnessLevel &&
                Objects.equals(name, flower.name) &&
                color == flower.color;
    }
}

