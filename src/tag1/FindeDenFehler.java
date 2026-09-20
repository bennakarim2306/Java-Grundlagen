package tag1;

/**
 * Debugging-Training: "Finde den Fehler"
 *
 * Spielregeln:
 *   1) Fehlerblock aussuchen
 *   2) Kommentarzeichen entfernen
 *   3) VORHERSAGEN, welche Fehlermeldung kommt
 *   4) Kompilieren, Meldung lesen, Fehler reparieren
 *   5) Wieder auskommentieren fuer den naechsten Durchgang
 *
 * Wichtig: Fehlermeldungen sind Hilfe, keine Strafe.
 * Immer zuerst auf die ZEILENNUMMER schauen!
 */
public class FindeDenFehler {
    public static void main(String[] args) {
        System.out.println("Starte Debug-Training.");
        System.out.println("Fehler 1 bis 8 stehen weiter unten als Kommentar.");
        System.out.println("Immer nur EINEN Fehler gleichzeitig aktivieren.");
    }

    static void fehler1_SemikolonFehlt() {
        // System.out.println("Hallo")
    }

    static void fehler2_GrossKleinschreibung() {
        // system.out.println("Hallo");
    }

    static void fehler3_AnfuehrungszeichenFehlt() {
        // System.out.println(Hallo);
    }

    static void fehler4_FalscherDatentyp() {
        // int alter = "zwanzig";
    }

    static void fehler5_CharMitDoppeltenAnfuehrungszeichen() {
        // char note = "A";
    }

    static void fehler6_KommazahlInInt() {
        // int preis = 19.99;
    }

    static void fehler7_VariableDoppelt() {
        // String name = "Ben";
        // String name = "Lea";
    }

    static void fehler8_LongOhneL() {
        // long einwohner = 8100000000;
    }

    /*
     * DISKUSSION
     * - Welche Fehlermeldung war am leichtesten zu verstehen?
     * - Welche war am verwirrendsten? Warum?
     * - Welcher Fehler passiert euch vermutlich am haeufigsten?
     */
}

