package tag2;

/**
 * Kurzuebung (ca. 15 Minuten) zum Stoff aus Tag2_09 bis Tag2_18:
 * Zuweisungsoperatoren, ++/--, boolesche Ausdruecke, Operator-Prioritaet,
 * verschachtelte Bedingungen, Schleifen (while/do-while/for),
 * verschachtelte Schleifen, break/continue.
 *
 * Aufgabe: Ergaenze die mit TODO markierten Stellen.
 * Loesungen stehen ganz unten auskommentiert, falls du nicht weiterkommst.
 */
public class Tag2_18b_UebungOperatorenSchleifen {
    public static void main(String[] args) {
        System.out.println("=== Uebung: Operatoren und Schleifen ===");

        // Aufgabe 1: Zuweisungsoperatoren
        // Starte mit guthaben = 100 und wende +=, -=, *=, /= an: +50, -20, *2, /4
        int guthaben = 100;
        // TODO: guthaben += 50;
        // TODO: guthaben -= 20;
        // TODO: guthaben *= 2;
        // TODO: guthaben /= 4;
        // TODO: Gib das Endergebnis aus.

        // Aufgabe 2: Inkrement/Dekrement
        // Erhoehe punkte zunaechst um 1 (Post-Inkrement), speichere den alten Wert in "alterWert",
        // erhoehe danach nochmal um 1 (Pre-Inkrement) und speichere das Ergebnis in "neuerWert".
        int punkte = 9;
        // TODO: int alterWert = punkte++;
        // TODO: int neuerWert = ++punkte;
        // TODO: Gib alterWert, neuerWert und punkte aus.

        // Aufgabe 3: Boolesche Ausdruecke
        // hatFuehrerschein = true, hatAuto = false
        // Pruefe: darfFahren (beide Bedingungen), darfMitfahren (mindestens eine), keinAuto (Negation von hatAuto)
        boolean hatFuehrerschein = true;
        boolean hatAuto = false;
        // TODO: boolean darfFahren = ...
        // TODO: boolean darfMitfahren = ...
        // TODO: boolean keinAuto = ...
        // TODO: Gib alle drei Werte aus.

        // Aufgabe 4: Operator-Prioritaet
        // Berechne "ergebnis" fuer den Ausdruck 5 + 2 * 3 - 4 / 2 ohne Klammern
        // TODO: int ergebnis = ...
        // TODO: Gib ergebnis aus (erwartet: 9).

        // Aufgabe 5: Verschachtelte Bedingungen
        // Pruefe fuer alter und hatBafoeg, ob Studierende ermaessigten Eintritt bekommen:
        // Wenn alter < 27 UND hatBafoeg true ist -> "Ermaessigt"
        // Wenn alter < 27 UND hatBafoeg false ist -> "Regulaer (unter 27)"
        // Sonst -> "Regulaer"
        int alter = 22;
        boolean hatBafoeg = true;
        // TODO: Schreibe die verschachtelte if-Struktur und gib das Ergebnis aus.

        // Aufgabe 6: Schleifen (while, do-while, for)
        // Gib mit einer for-Schleife alle geraden Zahlen von 2 bis 10 aus.
        // TODO: for-Schleife hier

        // Aufgabe 7: Verschachtelte Schleifen
        // Gib ein 3x3-Raster aus "#" Zeichen aus (3 Zeilen, je 3 Zeichen, mit Zeilenumbruch nach jeder Zeile).
        // TODO: aeussere und innere for-Schleife hier

        // Aufgabe 8: break und continue
        // Gib die Zahlen von 1 bis 20 aus, ueberspringe dabei Vielfache von 3 (continue)
        // und breche die Schleife komplett ab, sobald die Zahl 15 erreicht ist (break).
        // TODO: for-Schleife mit continue und break hier

        System.out.println("Fertig! Vergleiche deine Ausgaben mit den erwarteten Werten in den Kommentaren.");
    }
}

