package org.example;

public class Video extends AbstractMedia {
    private String reziser;

    public Video(String title, String reziser, int length, double price) {
        super(title, price, length);
        this.reziser = reziser;
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
