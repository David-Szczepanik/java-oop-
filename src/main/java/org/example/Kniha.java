package org.example;

public class Kniha extends AbstractMedia {
    private String autor;

    public Kniha(String title, String autor, double price) {
        super(title, price, 0);
        this.autor = autor;
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

