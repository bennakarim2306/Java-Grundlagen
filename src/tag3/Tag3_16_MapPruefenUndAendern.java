package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_16_MapPruefenUndAendern {
    public static void main(String[] args) {
        System.out.println("=== Map: pruefen, aendern, loeschen ===");

        Map<String, Integer> lagerbestand = new HashMap<>();
        lagerbestand.put("Aepfel", 50);
        lagerbestand.put("Bananen", 30);
        lagerbestand.put("Birnen", 0);

        System.out.println("containsKey(\"Aepfel\"): " + lagerbestand.containsKey("Aepfel"));
        System.out.println("containsKey(\"Kiwis\"): " + lagerbestand.containsKey("Kiwis"));
        System.out.println("containsValue(0): " + lagerbestand.containsValue(0));
        System.out.println("isEmpty(): " + lagerbestand.isEmpty());
        System.out.println("size(): " + lagerbestand.size());

        // Vorhandene Werte aktualisieren: put() ueberschreibt den bisherigen
        // Wert des Keys, replace() macht das Gleiche, aendert aber nichts,
        // wenn der Key noch gar nicht existiert.
        lagerbestand.put("Aepfel", 45);
        System.out.println("Nach put(\"Aepfel\", 45): " + lagerbestand.get("Aepfel"));

        lagerbestand.replace("Bananen", 25);
        System.out.println("Nach replace(\"Bananen\", 25): " + lagerbestand.get("Bananen"));

        lagerbestand.replace("Kiwis", 10); // hat keine Wirkung, da Key fehlt
        System.out.println("containsKey(\"Kiwis\") nach replace: " + lagerbestand.containsKey("Kiwis"));

        // Loeschen
        lagerbestand.remove("Birnen");
        System.out.println("Nach remove(\"Birnen\"): " + lagerbestand);

        // Denkfrage: Warum aendert replace("Kiwis", 10) hier nichts an der
        // Map, obwohl put("Kiwis", 10) an derselben Stelle einen neuen
        // Eintrag anlegen wuerde?

        lagerbestand.clear();
        System.out.println("Nach clear(): " + lagerbestand + ", isEmpty: " + lagerbestand.isEmpty());
    }

    // ==================== AUFGABE ====================
    // Erstelle eine eigene Map<String, Integer>, die Notenpunkte fuer
    // mindestens 5 Faecher deiner Wahl speichert.
    // Probiere damit aus:
    //  - Aktualisiere die Punktzahl eines vorhandenen Fachs.
    //  - Pruefe mit containsKey(), ob ein bestimmtes Fach enthalten ist.
    //  - Entferne ein Fach wieder aus der Map.
    //  - Frage mit getOrDefault() die Punktzahl eines nicht vorhandenen
    //    Fachs ab und ueberlege dir einen sinnvollen Standardwert.
}
