package tag2;

/**
 * Kurzuebung (ca. 15 Minuten) zum Stoff aus Tag2_19 bis Tag2_21:
 * Methoden (Parameter, Argumente, return), lokale Variablen und Scope,
 * Method Overloading.
 *
 * Aufgabe: Ergaenze die mit TODO markierten Stellen.
 * Loesungen stehen ganz unten auskommentiert, falls du nicht weiterkommst.
 */
public class Tag2_21b_UebungMethoden {
    public static void main(String[] args) {
        System.out.println("=== Uebung: Methoden, Scope, Overloading ===");

        // Aufgabe 1: Methode mit Rueckgabewert
        // Schreibe eine Methode "quadriere(int zahl)", die zahl * zahl zurueckgibt,
        // und rufe sie hier mit 6 auf.
        // TODO: int ergebnis = quadriere(6);
        // TODO: Gib ergebnis aus (erwartet: 36).

        // Aufgabe 2: void-Methode mit mehreren Parametern
        // Schreibe eine Methode "zeigeRechteck(int breite, int hoehe)", die
        // "Rechteck: <breite> x <hoehe>" ausgibt, und rufe sie mit 4 und 3 auf.
        // TODO: zeigeRechteck(4, 3);

        // Aufgabe 3: Scope
        // In der Methode "geheimzahl()" (unten zu ergaenzen) gibt es eine lokale Variable "code = 42".
        // Versuche NICHT, in main auf "code" zuzugreifen (das wuerde nicht kompilieren) -
        // rufe stattdessen geheimzahl() auf und beobachte, dass die Variable nur dort sichtbar ist.
        // TODO: geheimzahl();

        // Aufgabe 4: Method Overloading
        // Schreibe zwei ueberladene Methoden "verdoppele":
        //   - verdoppele(int zahl) -> gibt zahl * 2 zurueck (int)
        //   - verdoppele(double zahl) -> gibt zahl * 2 zurueck (double)
        // Rufe beide Varianten auf und gib die Ergebnisse aus.
        // TODO: System.out.println(verdoppele(5));
        // TODO: System.out.println(verdoppele(2.5));

        System.out.println("Fertig! Vergleiche deine Ausgaben mit den erwarteten Werten in den Kommentaren.");
    }

    // TODO: Aufgabe 1 - Methode quadriere(int zahl) implementieren

    // TODO: Aufgabe 2 - Methode zeigeRechteck(int breite, int hoehe) implementieren

    // TODO: Aufgabe 3 - Methode geheimzahl() implementieren (lokale Variable code = 42, ausgeben)

    // TODO: Aufgabe 4 - zwei ueberladene Methoden verdoppele(...) implementieren
}

