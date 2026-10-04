package tag2;

/**
 * Kurzuebung (ca. 15 Minuten) zum Stoff aus Tag2_19 bis Tag2_21:
 * Methoden (Parameter, Argumente, return), lokale Variablen und Scope,
 * Method Overloading.
 *
 * Aufgabe: Die Uebung zeigt fertige Beispiele fuer Methoden und Overloading.
 */
public class Tag2_21b_UebungMethoden {
    public static void main(String[] args) {
        System.out.println("=== Uebung: Methoden, Scope, Overloading ===");

        // Aufgabe 1: Methode mit Rueckgabewert
        // Schreibe eine Methode "quadriere(int zahl)", die zahl * zahl zurueckgibt,
        // und rufe sie hier mit 6 auf.
        int ergebnis = quadriere(6);
        System.out.println("Quadrat: " + ergebnis);

        // Aufgabe 2: void-Methode mit mehreren Parametern
        // Schreibe eine Methode "zeigeRechteck(int breite, int hoehe)", die
        // "Rechteck: <breite> x <hoehe>" ausgibt, und rufe sie mit 4 und 3 auf.
        zeigeRechteck(4, 3);

        // Aufgabe 3: Scope
        // In der Methode "geheimzahl()" (unten zu ergaenzen) gibt es eine lokale Variable "code = 42".
        // Versuche NICHT, in main auf "code" zuzugreifen (das wuerde nicht kompilieren) -
        // rufe stattdessen geheimzahl() auf und beobachte, dass die Variable nur dort sichtbar ist.
        geheimzahl();

        // Aufgabe 4: Method Overloading
        // Schreibe zwei ueberladene Methoden "verdoppele":
        //   - verdoppele(int zahl) -> gibt zahl * 2 zurueck (int)
        //   - verdoppele(double zahl) -> gibt zahl * 2 zurueck (double)
        // Rufe beide Varianten auf und gib die Ergebnisse aus.
        System.out.println(verdoppele(5));
        System.out.println(verdoppele(2.5));

        System.out.println("Fertig! Vergleiche deine Ausgaben mit den erwarteten Werten in den Kommentaren.");
    }

    public static int quadriere(int zahl) {
        return zahl * zahl;
    }

    public static void zeigeRechteck(int breite, int hoehe) {
        System.out.println("Rechteck: " + breite + " x " + hoehe);
    }

    public static void geheimzahl() {
        int code = 42;
        System.out.println("Geheimzahl: " + code);
    }

    public static int verdoppele(int zahl) {
        return zahl * 2;
    }

    public static double verdoppele(double zahl) {
        return zahl * 2;
    }
}
