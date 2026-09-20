package tag1;

/**
 * Thema: Kommentare
 *
 * Es gibt drei Arten:
 *   //  einzeiliger Kommentar
 *   /* ... *\/  mehrzeiliger Kommentar
 *   /** ... *\/ Dokumentationskommentar (Javadoc) - genau dieser hier
 *
 * ---------------------------------------------------------------
 * FRAGEN
 * - Was glaubt ihr: Aendert ein Kommentar die Ausgabe?
 * - Warum schreibt man Kommentare, wenn der Computer sie ignoriert?
 * - Wann ist ein Kommentar ueberfluessig?
 *   (Beispiel: "// Variable alter" ueber "int alter = 24;")
 *
 * SELBST AUSPROBIEREN
 * - Kommentiere unten EINE Ausgabezeile aus und fuehre den Code aus.
 * - Sage vorher voraus, wie viele Zeilen dann erscheinen.
 * - Schreibe zu jeder Zeile einen Kommentar, der das WARUM erklaert.
 *
 * FINDE DEN FEHLER
 * - siehe fehlerEcke() unten
 *
 * MINI-CHALLENGE
 * - Kommentiere den Code so, dass ihn jemand ohne Java-Kenntnis versteht.
 * ---------------------------------------------------------------
 */
public class KommentareUndAusgabe {
    public static void main(String[] args) {
        // 1) Einzeiliger Kommentar
        System.out.println("Diese Zeile wird ausgefuehrt.");

        /*
         * 2) Mehrzeiliger Kommentar
         *    Praktisch, um mehrere Zeilen kurz stillzulegen.
         */
        System.out.println("Diese Zeile auch.");

        // 3) Auskommentierter Code laeuft NICHT:
        // System.out.println("Diese Zeile bleibt stumm.");

        // 4) Guter Kommentar erklaert das WARUM, nicht das WAS:
        // Wir geben den Preis brutto aus, weil Kunden ihn so erwarten.
        double bruttoPreis = 11.90;
        System.out.println("Preis inkl. MwSt.: " + bruttoPreis + " EUR");

        // 5) Kommentar am Zeilenende
        System.out.println("Fertig.");  // Abschlussmeldung
    }

    /*
     * FINDE DEN FEHLER
     * Kommentarzeichen entfernen und herausfinden, warum es nicht kompiliert.
     */
    static void fehlerEcke() {
        // Fehler 1: mehrzeiliger Kommentar wird nie geschlossen
        // /* Start des Kommentars
        // System.out.println("Hallo");

        // Fehler 2: Schraegstrich fehlt (nur ein / statt //)
        // / Das soll ein Kommentar sein
        // System.out.println("Hallo");

        System.out.println("Fehlerecke: aktuell alles in Ordnung.");
    }
}

