package tag1;

/**
 * Thema: Variablen, primitive Datentypen, String, einfache Ausgabe
 *
 * Merksatz:  Datentyp name = wert;
 *
 * ---------------------------------------------------------------
 * FRAGEN
 * - Warum hat jede Variable einen Datentyp?
 * - Was glaubt ihr: Was gibt "1" + 2 aus? Und was 1 + 2?
 * - Warum steht bei long ein L und bei float ein f?
 * - Warum ist String kein primitiver Datentyp?
 *
 * SELBST AUSPROBIEREN
 * - Aendere alter auf dein Alter und fuehre den Code aus.
 * - Sage vorher voraus, was nach dem Ueberschreiben von alter ausgegeben wird.
 * - Aendere preis von double auf int. Was sagt der Compiler?
 *
 * FINDE DEN FEHLER
 * - siehe fehlerEcke() unten
 *
 * MINI-CHALLENGE
 * - Lege 3 neue Variablen an (Stadt, Postleitzahl, Regnet es?) und gib sie aus.
 * ---------------------------------------------------------------
 */
public class VariablenUndDatentypen {
    public static void main(String[] args) {
        // Primitive Datentypen
        byte kleineZahl = 120;
        short mittlereZahl = 30000;
        int alter = 24;
        long weltBevoelkerung = 8100000000L;

        float temperatur = 21.5f;
        double preis = 19.99;

        char ersterBuchstabe = 'B';
        boolean javaMachtSpass = true;

        // String ist ein Referenztyp (kein primitiver Typ)
        String name = "Ben";

        // Einfache Ausgabe und Verknupfung mit +
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Preis: " + preis + " EUR");
        System.out.println("Temperatur: " + temperatur + " C");
        System.out.println("Erster Buchstabe: " + ersterBuchstabe);
        System.out.println("Java macht Spass: " + javaMachtSpass);
        System.out.println("byte/short/long: " + kleineZahl + "/" + mittlereZahl + "/" + weltBevoelkerung);

        // Variablen koennen spaeter neue Werte bekommen (ohne Datentyp davor!).
        // VORHERSAGE: Welcher Wert steht jetzt in alter?
        alter = 25;
        System.out.println("Neues Alter: " + alter);

        // WAS PASSIERT, WENN ...?
        // Ein Plus zwischen Text und Zahl bedeutet "aneinanderhaengen".
        System.out.println("Ergebnis A: " + 1 + 2);
        System.out.println("Ergebnis B: " + (1 + 2));

        // char ist EIN Zeichen in ' ', String ist Text in " ".
        char zeichen = 'A';
        String textZeichen = "A";
        System.out.println("char: " + zeichen + " | String: " + textZeichen);

        // Grenzen der Typen zum Staunen (nur zeigen, nicht auswendig lernen):
        System.out.println("byte max: " + Byte.MAX_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);

        // Formatierte Ausgabe mit Platzhaltern
        System.out.printf("%s ist %d Jahre alt.%n", name, alter);
        System.out.printf("Preis: %.2f EUR%n", preis);
    }

    /*
     * FINDE DEN FEHLER
     * Kommentarzeichen einzeln entfernen, Fehlermeldung lesen, Ursache benennen.
     */
    static void fehlerEcke() {
        // Fehler 1: Text in eine Zahl-Variable
        // int alter = "20";

        // Fehler 2: char mit doppelten Anfuehrungszeichen
        // char note = "A";

        // Fehler 3: derselbe Variablenname zweimal
        // int punkte = 1;
        // int punkte = 2;

        System.out.println("Fehlerecke: aktuell alles in Ordnung.");
    }
}
