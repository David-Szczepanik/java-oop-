package org.example;

public class Video implements Media {
    private String titul;
    private String reziser;
    private int delka;
    private double cena;

    public Video(String titul, String reziser, int delka, double cena) {
      this.titul= titul;
      this.reziser = reziser;
      this.delka = delka;
      this.cena = cena;
    }
    public String getTitle() { return titul; }
    public double getPrice() { return cena; }
  public int getDelka() { return delka;}
}
