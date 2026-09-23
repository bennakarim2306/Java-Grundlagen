package tag3;

public class Tag3_01_MethodenGrundlagen {
    public static void main(String[] args) {
        System.out.println("=== Methoden: Zweck und Aufbau ===");

        // Ohne Methode muessten wir diesen Block jedes Mal von Hand wiederholen,
        // wenn wir eine Begruessung ausgeben wollen. Das fuehrt zu Duplikaten
        // und macht Aenderungen aufwendig, weil man sie an mehreren Stellen
        // anpassen muesste.
        System.out.println("Hallo, Anna!");
        System.out.println("Willkommen im Kurs.");

        // Mit einer Methode wird der Code wiederverwendbar: Wir schreiben die
        // Logik genau einmal und rufen sie beliebig oft auf.
        begruesse("Anna");
        begruesse("Tom");
        begruesse("Lea");

        // Denkfrage: Was müsste geändert werden, wenn sich der Begrüßungstext
        // ändern soll - der Aufruf begruesse(...) oder die Methode selbst?

        // static bedeutet hier vorerst nur: Die Methode gehört zur Klasse selbst
        // und nicht zu einem konkreten Objekt. Da main() ebenfalls static ist,
        // können wir solche Methoden direkt ohne "new" aufrufen.
        int summe = addiere(3, 5);
        System.out.println("3 + 5 = " + summe);
    }

    // Aufbau einer Methode:
    // Sichtbarkeit + static Rückgabetyp Methodenname (Parameterliste) { Methodenrumpf }
    //
    // void bedeutet: Diese Methode gibt keinen Wert zurück, sie führt nur eine Aktion aus.
    private static void begruesse(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    // int als Rückgabetyp bedeutet: Diese Methode liefert am Ende mit "return" einen int-Wert.
    // ersteZahl und zweiteZahl sind die Parameter - Platzhalter für Werte, die beim Aufruf
    // als Argumente übergeben werden (siehe addiere(3, 5) oben: 3 und 5 sind die Argumente).
    private static int addiere(int ersteZahl, int zweiteZahl) {
        int ergebnis = ersteZahl + zweiteZahl;
        return ergebnis;
    }
}
