package tag4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tag4_03_WiederholungTag3 {
    public static void main(String[] args) {
        System.out.println("=== Tag 4: Wiederholung von Tag 3 ===");

        // Aufgabe 1: Lege ein Array mit fuenf Lieblingszahlen an.
        int[] zahlen = {4, 7, 2, 9, 5};
        // TODO: Gib das erste Element aus.
        // TODO: Gib das letzte Element aus.

        // Aufgabe 2: Durchlaufe das Array mit einer for-Schleife.
        // TODO: Gib jede Zahl aus.

        // Aufgabe 3: Berechne die Summe des Arrays.
        int summe = 0;
        // TODO: Addiere jede Zahl aus zahlen zu summe.
        // TODO: Gib summe aus.

        // Aufgabe 4: Zaehle groessere Zahlen.
        int anzahlGrosserZahlen = 0;
        // TODO: Zaehle, wie viele Zahlen in zahlen groesser als 5 sind.
        // TODO: Gib das Ergebnis aus.

        // Aufgabe 5: Verwende eine Methode fuer die Summe.
        // TODO: Rufe berechneSumme(zahlen) auf und gib das Ergebnis aus.

        // Aufgabe 6: Erstelle eine ArrayList mit drei Fruechten.
        List<String> fruechte = new ArrayList<>();
        // TODO: Fuege Apfel, Banane und Birne hinzu.
        // TODO: Gib die Liste aus.

        // Aufgabe 7: Aendere und entferne einen Listeneintrag.
        // TODO: Aendere die erste Frucht in "Orange".
        // TODO: Entferne die letzte Frucht.
        // TODO: Gib die Liste erneut aus.

        // Aufgabe 8: Suche in der Liste.
        // TODO: Pruefe mit contains(), ob "Orange" enthalten ist.
        // TODO: Gib den Wahrheitswert aus.

        // Aufgabe 9: Durchlaufe die ArrayList.
        // TODO: Gib jede Frucht mit einer for-each-Schleife aus.

        // Aufgabe 10: Erstelle eine Map fuer zwei Schueler und ihre Punkte.
        Map<String, Integer> punkte = new HashMap<>();
        // TODO: Fuege "Mia" mit 80 und "Tom" mit 65 hinzu.
        // TODO: Lies die Punkte von Mia aus und gib sie aus.

        // Aufgabe 11: Aendere und pruefe einen Map-Eintrag.
        // TODO: Aendere Toms Punkte auf 70.
        // TODO: Pruefe mit containsKey(), ob es Mia gibt.
        // TODO: Gib die Map aus.

        // Aufgabe 12: Durchlaufe die Map.
        // TODO: Gib jeden Namen und die zugehoerigen Punkte aus.

        // Aufgabe 13: Filtere die Punkte.
        // TODO: Gib nur Namen aus, deren Punkte mindestens 70 sind.

        // Aufgabe 14: Schreibe eine Methode fuer die Ausgabe.
        // TODO: Rufe gibArrayAus(zahlen) auf.
        // TODO: Schreibe unten die Methode gibArrayAus(int[] werte).

        // Aufgabe 15: Schreibe eine Methode fuer eine Liste.
        // TODO: Rufe gibListeAus(fruechte) auf.
        // TODO: Schreibe unten die Methode gibListeAus(List<String> eintraege).

        System.out.println("Ende der Tag-3-Wiederholung.");
    }

    public static int berechneSumme(int[] werte) {
        int summe = 0;
        // TODO: Addiere alle Werte und gib summe zurueck.
        return summe;
    }

    public static void gibArrayAus(int[] werte) {
        // TODO: Gib jedes Element des Arrays aus.
    }

    public static void gibListeAus(List<String> eintraege) {
        // TODO: Gib jeden Eintrag der Liste aus.
    }
}
