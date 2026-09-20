package tag1;

/**
 * Thema: Aufbau eines Java-Programms + grundlegende Syntax
 *
 * Bausteine von oben nach unten:
 *   1) package tag1;           -> zu welchem Paket/Ordner gehoert die Datei
 *   2) public class ...        -> Klassenkopf (Name = Dateiname!)
 *   3) public static void main -> Startpunkt des Programms
 *   4) Anweisungen             -> enden mit ;
 *   5) { }                     -> begrenzen Bloecke
 *
 * ---------------------------------------------------------------
 * FRAGEN
 * - Warum muss der Klassenname genauso heissen wie die Datei?
 * - Was passiert, wenn man "main" in "start" umbenennt?
 * - Warum braucht der Compiler das Semikolon?
 * - Zaehlt: Wie viele { und wie viele } stehen in dieser Datei?
 *
 * SELBST AUSPROBIEREN
 * - Verschiebe eine Ausgabezeile nach oben. Aendert sich das Ergebnis?
 * - Schreibe zwei Anweisungen in EINE Zeile. Geht das?
 * - Entferne die Einrueckung einer Zeile. Laeuft das Programm trotzdem?
 *
 * FINDE DEN FEHLER
 * - siehe fehlerEcke() unten
 *
 * MINI-CHALLENGE
 * - Baue aus dem Gedaechtnis nach: Klasse + main + eine Ausgabe.
 * ---------------------------------------------------------------
 */
public class ProgrammstrukturUndSyntax {
    public static void main(String[] args) {
        // Jede Anweisung endet in Java mit einem Semikolon.
        System.out.println("Java hat eine klare Struktur.");

        // Anweisungen werden streng von oben nach unten abgearbeitet.
        System.out.println("1. Zeile");
        System.out.println("2. Zeile");
        System.out.println("3. Zeile");

        // Gross- und Kleinschreibung ist wichtig: String != string.
        String text = "Syntax ist streng, aber vorhersehbar.";
        System.out.println(text);

        // Namen sind frei waehlbar - sollten aber etwas aussagen.
        String unklarerName = "x";
        String sprechenderName = "begruessung";
        System.out.println(unklarerName + " vs. " + sprechenderName);

        // Leerzeichen und Einrueckung sind fuer Menschen, nicht fuer den Compiler.
        System.out.println(     "Auch diese Zeile ist gueltig."     );

        // Zwei Anweisungen in einer Zeile sind erlaubt (aber unuebersichtlich):
        System.out.print("A"); System.out.println("B");

        // Der Compiler liest Kommentare NICHT:
        // System.out.println("Diese Zeile erscheint nie.");
        System.out.println("Ende von main.");
    }

    /*
     * FINDE DEN FEHLER
     * Kommentarzeichen einzeln entfernen und die Fehlermeldung gemeinsam lesen.
     */
    static void fehlerEcke() {
        // Fehler 1: Datentyp fehlt
        // meinText = "Hallo";

        // Fehler 2: Variable wird vor ihrer Deklaration benutzt
        // System.out.println(zahl);
        // int zahl = 5;

        // Fehler 3: eine Klammer zu viel
        // System.out.println("Hallo"));

        System.out.println("Fehlerecke: aktuell alles in Ordnung.");
    }
}
