package org.example;

public class Video extends AbstractMedia  {
    private String titul;
    private String reziser;
    private int delka;
    private double cena;

    public Video(String titul, String reziser, int delka, double cena) {
    super(titul, cena, delka);
    this.reziser = reziser;
}
}
