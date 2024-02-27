package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    System.out.println("---CD Video Pole---");
    CD cd1 = new CD("CD1", "Interpret1", 60, 300);
    CD cd2 = new CD("CD2", "Interpret2", 70, 350);
    Video video1 = new Video("Video1", "Reziser1", 120, 200);
    Video video2 = new Video("Video2", "Reziser2", 150, 250);

    Media[] mediaPole = new Media[]{
        cd1, cd2, video1, video2
    };

    for (Media media : mediaPole) {
      System.out.println("Titul: " + media.getTitle());
      System.out.println("Cena: " + media.getPrice());
    }

    System.out.println("\n---Knihy Pole---");
    Kniha[] knihaPole = new Kniha[]{
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
    mediaList.addAll(Arrays.asList(mediaPole));

    Video v1 = new Video("video", "reziser", 60, 200);
    Kniha k1 = new Kniha("Kniha1", "autor", 250);

    System.out.println(cd1.getDelka());

    mediaList.add(cd1);
    mediaList.add(v1);
    mediaList.add(k1);

    double celkovaCena = 0;
    for (Media media : mediaList) {
      System.out.println("Titul: " + media.getTitle());
      System.out.println("Cena: " + media.getPrice());
      celkovaCena += media.getPrice();
    }
    System.out.println("Celková cena: " + celkovaCena);
  }
}