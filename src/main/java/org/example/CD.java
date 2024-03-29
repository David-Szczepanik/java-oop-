package org.example;

public class CD extends AbstractMedia {
    private String titul;
    private String interpret;
    private int delka;
    private double cena;

    public CD(String titul, String interpret, int delka, double cena) {
        super(titul, cena, delka);
        this.interpret = interpret;
    }

    @Override
    public String getTitle() {
        return titul;
    }

    @Override
    public double getPrice() {
        return cena;
    }

    @Override
    public int getDelka() {
        return delka;
    }
}