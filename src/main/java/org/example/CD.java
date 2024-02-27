package org.example;

public class CD implements Media {
    private String titul;
    private String interpret;
    private int delka;
    private double cena;

  public CD(String titul, String interpret, int delka, double cena) {
    this.titul = titul;
    this.interpret = interpret;
    this.delka = delka;
    this.cena = cena;
  }

  public String getTitle() { return titul; }
    public double getPrice() { return cena; }
}