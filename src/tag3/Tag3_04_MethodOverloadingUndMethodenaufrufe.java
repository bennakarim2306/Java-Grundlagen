package tag3;

public class Tag3_04_MethodOverloadingUndMethodenaufrufe {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading und Methoden, die andere Methoden aufrufen ===");

        // Method Overloading: Mehrere Methoden mit demselben Namen, aber
        // unterschiedlicher Parameterliste (Anzahl oder Typ). Java entscheidet
        // anhand der Argumente, welche Variante gemeint ist.
        System.out.println("addiere(2, 3) = " + addiere(2, 3));
        System.out.println("addiere(2.5, 3.5) = " + addiere(2.5, 3.5));
        System.out.println("addiere(1, 2, 3) = " + addiere(1, 2, 3));

        // Denkfrage: Warum reicht es für Overloading nicht aus, nur den
        // Rückgabetyp einer Methode zu ändern?

        // Methoden können andere Methoden aufrufen, um kleine Bausteine zu
        // kombinieren, statt alles in einer einzigen großen Methode zu lösen.
        System.out.println("Durchschnitt von 4, 8, 12: " + durchschnittVonDrei(4, 8, 12));
    }

    private static int addiere(int a, int b) {
        return a + b;
    }

    private static double addiere(double a, double b) {
        return a + b;
    }

    private static int addiere(int a, int b, int c) {
        return a + b + c;
    }

    // Diese Methode nutzt die bereits vorhandene Methode addiere(int, int, int),
    // statt die Addition erneut selbst auszuschreiben - kleine, klar abgegrenzte
    // Methoden lassen sich so kombinieren.
    private static double durchschnittVonDrei(int a, int b, int c) {
        int summe = addiere(a, b, c);
        return summe / 3.0;
    }

    // ==================== AUFGABE ====================
    // Schreibe eine eigene ueberladene Methode "maximum", die das groessere
    // von zwei Werten zurueckgibt:
    //   - einmal fuer zwei int-Werte
    //   - einmal fuer zwei double-Werte
    // Rufe beide Varianten in main() mit selbst gewaehlten Zahlen auf und
    // gib die Ergebnisse aus. Ueberlege dir zusaetzlich eine dritte sinnvolle
    // Ueberladung (z. B. fuer drei Werte) und probiere sie aus.
}
