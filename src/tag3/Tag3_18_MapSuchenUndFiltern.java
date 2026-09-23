package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_18_MapSuchenUndFiltern {
    public static void main(String[] args) {
        System.out.println("=== Map durchsuchen und filtern (ohne Streams) ===");

        Map<String, Integer> gehaltProMitarbeiter = new HashMap<>();
        gehaltProMitarbeiter.put("Anna", 3200);
        gehaltProMitarbeiter.put("Tom", 2800);
        gehaltProMitarbeiter.put("Lea", 4100);
        gehaltProMitarbeiter.put("Max", 2500);

        // Eintrag anhand eines Keys finden (get liefert null, wenn nicht vorhanden)
        System.out.println("Gehalt von Lea: " + gehaltProMitarbeiter.get("Lea"));

        // Werte anhand einer Bedingung suchen: Map durchlaufen und pruefen.
        boolean vorhanden = false;
        for (int gehalt : gehaltProMitarbeiter.values()) {
            if (gehalt > 4000) {
                vorhanden = true;
                break;
            }
        }
        System.out.println("Gibt es ein Gehalt > 4000? " + vorhanden);

        // Passende Eintraege in eine neue Map uebernehmen (filtern)
        Map<String, Integer> gutVerdienende = new HashMap<>();
        for (Map.Entry<String, Integer> eintrag : gehaltProMitarbeiter.entrySet()) {
            if (eintrag.getValue() >= 3000) {
                gutVerdienende.put(eintrag.getKey(), eintrag.getValue());
            }
        }
        System.out.println("Gehalt >= 3000: " + gutVerdienende);

        // Passende Werte zaehlen
        int anzahlUeber3000 = 0;
        for (int gehalt : gehaltProMitarbeiter.values()) {
            if (gehalt > 3000) {
                anzahlUeber3000++;
            }
        }
        System.out.println("Anzahl Gehaelter > 3000: " + anzahlUeber3000);

        // Denkfrage: Warum reicht bei der Suche "Gibt es einen Wert > 4000?"
        // ein einfaches Durchlaufen von values(), waehrend man beim Filtern
        // in eine neue Map zusaetzlich entrySet() braucht?
    }

    // ==================== AUFGABE ====================
    // Erstelle eine eigene Map<String, Integer> mit mindestens 5 Produkten
    // und ihren Preisen (Key = Produktname, Value = Preis in Cent oder Euro).
    // Schreibe dir dazu:
    //  - eine Suche, die herausfindet, ob es ein Produkt guenstiger als ein
    //    von dir gewaehlter Betrag gibt.
    //  - eine neue Map, die nur die Produkte oberhalb eines bestimmten Preises
    //    enthaelt.
    //  - eine Zaehlung, wie viele Produkte einen bestimmten Preis
    //    ueberschreiten.
}
