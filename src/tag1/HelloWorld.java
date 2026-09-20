package tag1;


/**
 * Thema: Hello World + erste Konsolenausgabe
 *
 * ---------------------------------------------------------------
 * FRAGEN (vor dem Ausfuehren beantworten!)
 * - Wie viele Zeilen erscheinen in der Konsole?
 * - Warum steht der Text in Anfuehrungszeichen?
 * - Was passiert, wenn man "println" zu "printn" aendert?
 *
 * SELBST AUSPROBIEREN
 * - Aendere "Hello World!" in deinen eigenen Namen.
 * - Sage voraus, was passiert, wenn du bei einer Zeile das ";" loeschst.
 * - Vertausche zwei Zeilen und pruefe die Reihenfolge der Ausgabe.
 *
 * FINDE DEN FEHLER
 * - siehe fehlerEcke() weiter unten (Kommentarzeichen entfernen!)
 *
 * MINI-CHALLENGE
 * - Gib genau 4 Zeilen aus: Name, Wohnort, Lieblingsfarbe, Lieblingszahl.
 * ---------------------------------------------------------------
 */
public class HelloWorld {
    public static void main(String[] args) {
        // Das erste Programm: Text in die Konsole schreiben.
        System.out.println("Hello World!");

        // println = "print line" -> Text ausgeben UND in die naechste Zeile springen.
        System.out.println("Ich lerne heute Java.");

        // print = ohne Zeilenumbruch.
        // Vorhersage: Stehen die naechsten Texte in EINER Zeile?
        System.out.print("Erst hier ");
        System.out.print("und direkt weiter. ");
        System.out.println("Jetzt kommt der Umbruch.");

        // Eine leere Zeile erzeugen:
        System.out.println();
        System.out.println("Nach der leeren Zeile.");

        // Was macht \n mitten im Text?
        System.out.println("Zeile A\nZeile B");

        // Und was macht \t ?
        System.out.println("Links\tRechts");

        // Anfuehrungszeichen im Text brauchen einen Backslash:
        System.out.println("Er sagte: \"Java ist logisch.\"");

        // MINI-CHALLENGE (hier selbst 4 Zeilen ergaenzen):
        // System.out.println("...");
    }

    /*
     * FINDE DEN FEHLER
     * Entferne die Kommentarzeichen einzeln und beantworte:
     * Warum kompiliert das nicht? Wie lautet die Fehlermeldung?
     * Diese Methode wird nie aufgerufen - sie ist nur zum Ausprobieren da.
     */
    static void fehlerEcke() {
        // Fehler 1: fehlendes Semikolon
        // System.out.println("Fehler 1")

        // Fehler 2: falsche Gross-/Kleinschreibung
        // system.out.println("Fehler 2");

        // Fehler 3: fehlende Anfuehrungszeichen
        // System.out.println(Fehler 3);

        System.out.println("Fehlerecke: aktuell alles in Ordnung.");
    }
}
