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
        System.out.println("Erstes Element: " + zahlen[0]);
        System.out.println("Letztes Element: " + zahlen[zahlen.length - 1]);

        // Aufgabe 2: Durchlaufe das Array mit einer for-Schleife.
        // TODO: Gib jede Zahl aus.
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        // Aufgabe 3: Berechne die Summe des Arrays.
        int summe = 0;
        // TODO: Addiere jede Zahl aus zahlen zu summe.
        // TODO: Gib summe aus.
        for (int zahl : zahlen) {
            summe += zahl;
        }
        System.out.println("Summe: " + summe);

        // Aufgabe 4: Zähle größere Zahlen.
        int anzahlGrosserZahlen = 0;
        // TODO: Zaehle, wie viele Zahlen in zahlen groesser als 5 sind.
        // TODO: Gib das Ergebnis aus.
        for (int zahl : zahlen) {
            if (zahl > 5) {
                anzahlGrosserZahlen++;
            }
        }
        System.out.println("Zahlen groesser als 5: " + anzahlGrosserZahlen);

        // Aufgabe 5: Verwende eine Methode für die Summe.
        // TODO: Rufe berechneSumme(zahlen) auf und gib das Ergebnis aus.
        System.out.println("Summe aus Methode: " + berechneSumme(zahlen));

        // Aufgabe 6: Erstelle eine ArrayList mit drei Früchten.
        List<String> fruechte = new ArrayList<>();
        // TODO: Fuege Apfel, Banane und Birne hinzu.
        // TODO: Gib die Liste aus.
        fruechte.add("Apfel");
        fruechte.add("Banane");
        fruechte.add("Birne");
        System.out.println(fruechte);

        // Aufgabe 7: Ändere und entferne einen Listeneintrag.
        // TODO: Aendere die erste Frucht in "Orange".
        // TODO: Entferne die letzte Frucht.
        // TODO: Gib die Liste erneut aus.
        fruechte.set(0, "Orange");
        fruechte.removeLast();
        System.out.println(fruechte);

        // Aufgabe 8: Suche in der Liste.
        // TODO: Pruefe mit contains(), ob "Orange" enthalten ist.
        // TODO: Gib den Wahrheitswert aus.
        System.out.println("Enthaelt Orange: " + fruechte.contains("Orange"));

        // Aufgabe 9: Durchlaufe die ArrayList.
        // TODO: Gib jede Frucht mit einer for-each-Schleife aus.
        for (String frucht : fruechte) {
            System.out.println(frucht);
        }

        // Aufgabe 10: Erstelle eine Map fuer zwei Schueler und ihre Punkte.
        // TODO: Fuege "Mia" mit 80 und "Tom" mit 65 hinzu.
        // TODO: Lies die Punkte von Mia aus und gib sie aus.
        Map<String, Integer> punkte = new HashMap<>();
        punkte.put("Mia", 80);
        punkte.put("Tom", 65);
        System.out.println("Mias Punkte: " + punkte.get("Mia"));

        // Aufgabe 11: Aendere und pruefe einen Map-Eintrag.
        // TODO: Aendere Toms Punkte auf 70.
        // TODO: Pruefe mit containsKey(), ob es Mia gibt.
        // TODO: Gib die Map aus.
        punkte.put("Tom", 70);
        boolean enthaeltMia = punkte.containsKey("Mia");
        System.out.println("Enthaelt Mia: " + enthaeltMia);
        System.out.println(punkte);

        // Aufgabe 12: Durchlaufe die Map.
        // TODO: Gib jeden Namen und die zugehoerigen Punkte aus.
        for (Map.Entry<String, Integer> eintrag : punkte.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        // Aufgabe 13: Filtere die Punkte.
        // TODO: Gib nur Namen aus, deren Punkte mindestens 70 sind.
        for (Map.Entry<String, Integer> eintrag : punkte.entrySet()) {
            if (eintrag.getValue() >= 70) {
                System.out.println(eintrag.getKey());
            }
        }

        // Aufgabe 14: Schreibe eine Methode fuer die Ausgabe.
        gibArrayAus(zahlen);

        // Aufgabe 15: Schreibe eine Methode fuer eine Liste.
        gibListeAus(fruechte);

        System.out.println("Ende der Tag-3-Wiederholung.");
    }

    public static int berechneSumme(int[] werte) {
        int summe = 0;
        for (int wert : werte) {
            summe += wert;
        }
        return summe;
    }

    public static void gibArrayAus(int[] werte) {
        for (int wert : werte) {
            System.out.println(wert);
        }
    }

    public static void gibListeAus(List<String> eintraege) {
        for (String eintrag : eintraege) {
            System.out.println(eintrag);
        }
    }
}
