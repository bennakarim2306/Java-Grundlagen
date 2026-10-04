package tag1;

/**
 * Uebungsdatei: Hier darfst du alles veraendern!
 *
 * Arbeitsweise:
 *   1) Aufgabe lesen
 *   2) VORHERSAGEN, was herauskommt
 *   3) Aendern und ausfuehren
 *   4) Vergleichen: Vorhersage == Ausgabe?
 */
public class SelberAendern {
    public static void main(String[] args) {
        String name = "Ben";

        int alter = 19;

        boolean hatGeuebt = true;

        char lieblingsNote = 'A';

        double kontostand = 24.75;

        System.out.println("Ich heisse " + name + ".");
        System.out.println("Ich bin " + alter + " Jahre alt.");
        System.out.println("Heute geuebt: " + hatGeuebt);
        System.out.println("Lieblingsnote: " + lieblingsNote);
        System.out.println("Kontostand: " + kontostand + " EUR");

        // Bonus: Nutze printf fuer eine formatierte Zeile.
        System.out.printf("%s (%d) - Kontostand: %.2f EUR%n", name, alter, kontostand);
        // ---------------------------------------------------------------
        // ---------------------------------------------------------------
        alter = alter + 1;
        System.out.println("Naechstes Jahr: " + alter);

        String stadt = "Musterstadt";
        System.out.println("Stadt: " + stadt);

        double temperatur = 21.6;
        System.out.printf("Temperatur: %.1f Grad%n", temperatur);

        System.out.print("Diese Zeile nutzt print ");
        System.out.println("und wird hier fortgesetzt.");

        String compilerHinweis = "Datentypen wie String muessen korrekt grossgeschrieben werden.";
        System.out.println(compilerHinweis);

        System.out.println(name + " (" + alter + ") aus " + stadt);
        // ---------------------------------------------------------------
    }
}
