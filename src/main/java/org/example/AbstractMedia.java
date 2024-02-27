package org.example;

public abstract class AbstractMedia {
    protected String title;
    protected double price;
    protected int length;

    public AbstractMedia(String title, double price, int length) {
        this.title = title;
        this.price = price;
        this.length = length;
    }

    public abstract String getTitle();
    public abstract double getPrice();
    public abstract int getDelka();
}