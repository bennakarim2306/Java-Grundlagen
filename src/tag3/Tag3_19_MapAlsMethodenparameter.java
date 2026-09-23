package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_19_MapAlsMethodenparameter {
    public static void main(String[] args) {
        System.out.println("=== Maps als Methodenparameter und Rueckgabewert ===");

        Map<String, Integer> bestand = new HashMap<>();
        bestand.put("Schrauben", 100);
        bestand.put("Naegel", 50);
        bestand.put("Muttern", 0);

        // Wie bei Arrays und Listen wird auch bei Maps eine Referenz
        // uebergeben - Aenderungen innerhalb der Methode wirken sich direkt
        // auf die uebergebene Map aus.
        aktualisiereBestand(bestand, "Schrauben", 90);
        System.out.println("Nach aktualisiereBestand: " + bestand);

        boolean istVorhanden = enthaeltProdukt(bestand, "Naegel");
        System.out.println("Enthaelt 'Naegel'? " + istVorhanden);

        // Eine Methode kann auch eine neue, gefilterte Map zurueckgeben.
        Map<String, Integer> ausverkauft = findeAusverkaufteProdukte(bestand);
        System.out.println("Ausverkaufte Produkte: " + ausverkauft);

        entferneProdukt(bestand, "Muttern");
        System.out.println("Nach entferneProdukt: " + bestand);

        // Denkfrage: Warum veraendert findeAusverkaufteProdukte(bestand) die
        // urspruengliche Map "bestand" nicht, obwohl auch hier eine Referenz
        // uebergeben wird - was macht diese Methode intern anders?
    }

    private static void aktualisiereBestand(Map<String, Integer> map, String produkt, int neueMenge) {
        map.put(produkt, neueMenge);
    }

    private static boolean enthaeltProdukt(Map<String, Integer> map, String produkt) {
        return map.containsKey(produkt);
    }

    private static void entferneProdukt(Map<String, Integer> map, String produkt) {
        map.remove(produkt);
    }

    private static Map<String, Integer> findeAusverkaufteProdukte(Map<String, Integer> map) {
        Map<String, Integer> ergebnis = new HashMap<>();
        for (Map.Entry<String, Integer> eintrag : map.entrySet()) {
            if (eintrag.getValue() == 0) {
                ergebnis.put(eintrag.getKey(), eintrag.getValue());
            }
        }
        return ergebnis;
    }

    // ==================== AUFGABE ====================
    // Schreibe eine Methode "erhoeheAlleUm(Map<String, Integer> map, int betrag)",
    // die zu jedem Wert in der Map den angegebenen Betrag addiert (die Map
    // soll sich dabei direkt veraendern).
    // Schreibe eine Methode "summeAllerWerte(Map<String, Integer> map)", die
    // die Summe aller Values zurueckgibt.
    // Schreibe eine Methode "findeProduktMitHoechstemWert(Map<String, Integer> map)",
    // die den Key mit dem groessten zugehoerigen Wert zurueckgibt.
    // Teste alle drei Methoden in main() mit einer selbst erstellten Map.
}
