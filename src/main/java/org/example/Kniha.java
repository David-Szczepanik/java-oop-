package org.example;

public class Kniha implements Media {
  private String titul;
  private String autor;
  private double cena;

  public Kniha(String titul, String autor, double cena) {
    this.titul = titul;
    this.autor = autor;
    this.cena = cena;
  }

  public String getTitle() {
    return titul;
  }

  public double getPrice() {
    return cena;
  }

  @Override
  public int getDelka() {
    return 0;
  }

}

