package tag3;

import java.util.ArrayList;
import java.util.List;

public class Tag3_13_ListenAlsMethodenparameter {
    public static void main(String[] args) {
        System.out.println("=== Listen als Methodenparameter und Rueckgabewert ===");

        List<String> namen = new ArrayList<>();
        namen.add("Anna");
        namen.add("Tom");
        namen.add("Lea");

        // Eine List als Parameter zu uebergeben, uebergibt (wie beim Array)
        // eine Referenz auf dieselbe Liste - Methoden, die die Liste
        // veraendern, wirken sich direkt auf das Original aus.
        fuegeHinzu(namen, "Max");
        System.out.println("Nach fuegeHinzu: " + namen);

        boolean gefunden = enthaeltNamen(namen, "Lea");
        System.out.println("Enthaelt 'Lea'? " + gefunden);

        // Eine Methode kann auch eine komplett neue Liste als Ergebnis
        // zurueckgeben, ohne die urspruengliche Liste zu veraendern.
        List<String> kurzeNamen = filterKurzeNamen(namen, 3);
        System.out.println("Namen mit max. 3 Buchstaben: " + kurzeNamen);
        System.out.println("Original bleibt: " + namen);

        entferneNamen(namen, "Tom");
        System.out.println("Nach entferneNamen: " + namen);

        // Denkfrage: Warum bleibt "namen" nach filterKurzeNamen(...)
        // unveraendert, obwohl wir es als Parameter uebergeben haben - was
        // macht die Methode intern anders als fuegeHinzu oder entferneNamen?
    }

    private static void fuegeHinzu(List<String> liste, String name) {
        liste.add(name);
    }

    private static void entferneNamen(List<String> liste, String name) {
        liste.remove(name);
    }

    private static boolean enthaeltNamen(List<String> liste, String gesucht) {
        return liste.contains(gesucht);
    }

    private static List<String> filterKurzeNamen(List<String> liste, int maxLaenge) {
        List<String> ergebnis = new ArrayList<>();
        for (String name : liste) {
            if (name.length() <= maxLaenge) {
                ergebnis.add(name);
            }
        }
        return ergebnis;
    }

    // ==================== AUFGABE ====================
    // Schreibe eine Methode "addiereAlle(List<Integer> liste)", die die Summe
    // aller Werte einer Liste zurueckgibt.
    // Schreibe eine weitere Methode "findeGroesste(List<Integer> liste)", die
    // den groessten Wert der Liste zurueckgibt.
    // Schreibe eine Methode "entferneAlleUnter(List<Integer> liste, int grenze)",
    // die alle Werte unterhalb von "grenze" aus der uebergebenen Liste
    // entfernt (die Liste soll sich dabei direkt veraendern, kein
    // Rueckgabewert noetig).
    // Teste alle drei Methoden in main() mit einer selbst erstellten Liste.
}
