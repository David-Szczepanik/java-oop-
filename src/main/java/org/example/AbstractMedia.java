package org.example;

public abstract class AbstractMedia implements Media {
    protected String title;
    protected double price;
    protected int length;

    public AbstractMedia(String title, double price, int length) {
        this.title = title;
        this.price = price;
        this.length = length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getDelka() {
        return length;
    }
}
