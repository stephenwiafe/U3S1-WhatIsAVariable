package com.codedifferently.lab.partB;

public class Coin implements Comparable<Coin>{
    final private String name;
    final private double value;

    public Coin() {
        this.name = "";
        this.value = 0.0;
    }

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int compareTo(Coin otherCoin) {
        return Double.compare(this.value, otherCoin.value);
    }

    public String toString() {
        return "Name of coin: " + getName() + ", Value: $" + getValue();
    }
}