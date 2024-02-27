package org.example;

public class Kniha implements Media {
    private String jmeno;
    private String autor;
    private double cenaSDph;

    public Kniha(String jmeno, String autor, double cenaSDph) {
      this.jmeno = jmeno;
      this.autor = autor;
      this.cenaSDph = cenaSDph;
    }

    public String getTitle() { return jmeno; }
    public double getPrice() { return cenaSDph; }
}
