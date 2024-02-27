package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    System.out.println("---CD Video Pole---");
    Media[] mediaArray = new Media[] {
    new CD("CD1", "Interpret1", 60, 300),
    new CD("CD2", "Interpret2", 70, 350),
    new Video("Video1", "Reziser1", 120, 200),
    new Video("Video2", "Reziser2", 150, 250)
};
    for (Media media : mediaArray) {
    System.out.println("Titul: " + media.getTitle());
    System.out.println("Cena: " + media.getPrice());
}

    System.out.println("\n---Knihy Pole---");
    Kniha[] knihaPole = new Kniha[] {
    new Kniha("Kniha1", "Autor1", 250),
    new Kniha("Kniha2", "Autor2", 300),
    new Kniha("Kniha3", "Autor3", 350)
};
    for (Kniha kniha : knihaPole) {
    System.out.println("Titul: " + kniha.getTitle());
    System.out.println("Cena: " + kniha.getPrice());
}
    System.out.println("\n---Kolekce---");

    List<Media> mediaList = new ArrayList<>();

    CD cd1 = new CD("titulCD", "interpret", 20, 300);
    Video v1 = new Video("video","reziser",60,200);
    Kniha k1 = new Kniha("Kniha1","autor", 250);

    mediaList.add(cd1);
    mediaList.add(v1);
    mediaList.add(k1);

    double celkovaCena= 0;
    for (Media media : mediaList) {
      System.out.println("Titul: " + media.getTitle());
      System.out.println("Cena: " + media.getPrice());
      celkovaCena+= media.getPrice();
    }
    System.out.println("Celková cena: " + celkovaCena);
  }
}