package tag2;

/**
 * Kurzuebung (ca. 15 Minuten) zum Stoff aus Tag2_09 bis Tag2_18:
 * Zuweisungsoperatoren, ++/--, boolesche Ausdruecke, Operator-Prioritaet,
 * verschachtelte Bedingungen, Schleifen (while/do-while/for),
 * verschachtelte Schleifen, break/continue.
 *
 * Aufgabe: Die Uebung zeigt fertige Beispiele zu Operatoren und Schleifen.
 */
public class Tag2_18b_UebungOperatorenSchleifen {
    public static void main(String[] args) {
        System.out.println("=== Uebung: Operatoren und Schleifen ===");

        // Aufgabe 1: Zuweisungsoperatoren
        // Starte mit guthaben = 100 und wende +=, -=, *=, /= an: +50, -20, *2, /4
        int guthaben = 100;
        guthaben += 50;
        guthaben -= 20;
        guthaben *= 2;
        guthaben /= 4;
        System.out.println("Guthaben: " + guthaben);

        // Aufgabe 2: Inkrement/Dekrement
        // Erhoehe punkte zunaechst um 1 (Post-Inkrement), speichere den alten Wert in "alterWert",
        // erhoehe danach nochmal um 1 (Pre-Inkrement) und speichere das Ergebnis in "neuerWert".
        int punkte = 9;
        int alterWert = punkte++;
        int neuerWert = ++punkte;
        System.out.println("Alter Wert: " + alterWert);
        System.out.println("Neuer Wert: " + neuerWert);
        System.out.println("Punkte: " + punkte);

        // Aufgabe 3: Boolesche Ausdruecke
        // hatFuehrerschein = true, hatAuto = false
        // Pruefe: darfFahren (beide Bedingungen), darfMitfahren (mindestens eine), keinAuto (Negation von hatAuto)
        boolean hatFuehrerschein = true;
        boolean hatAuto = false;
        boolean darfFahren = hatFuehrerschein && hatAuto;
        boolean darfMitfahren = hatFuehrerschein || hatAuto;
        boolean keinAuto = !hatAuto;
        System.out.println("Darf fahren: " + darfFahren);
        System.out.println("Darf mitfahren: " + darfMitfahren);
        System.out.println("Kein Auto: " + keinAuto);

        // Aufgabe 4: Operator-Prioritaet
        // Berechne "ergebnis" fuer den Ausdruck 5 + 2 * 3 - 4 / 2 ohne Klammern
        int ergebnis = 5 + 2 * 3 - 4 / 2;
        System.out.println("Ergebnis: " + ergebnis);

        // Aufgabe 5: Verschachtelte Bedingungen
        // Pruefe fuer alter und hatBafoeg, ob Studierende ermaessigten Eintritt bekommen:
        // Wenn alter < 27 UND hatBafoeg true ist -> "Ermaessigt"
        // Wenn alter < 27 UND hatBafoeg false ist -> "Regulaer (unter 27)"
        // Sonst -> "Regulaer"
        int alter = 22;
        boolean hatBafoeg = true;
        if (alter < 27) {
            if (hatBafoeg) {
                System.out.println("Ermaessigt");
            } else {
                System.out.println("Regulaer (unter 27)");
            }
        } else {
            System.out.println("Regulaer");
        }

        // Aufgabe 6: Schleifen (while, do-while, for)
        // Gib mit einer for-Schleife alle geraden Zahlen von 2 bis 10 aus.
        for (int zahl = 2; zahl <= 10; zahl += 2) {
            System.out.println(zahl);
        }

        // Aufgabe 7: Verschachtelte Schleifen
        // Gib ein 3x3-Raster aus "#" Zeichen aus (3 Zeilen, je 3 Zeichen, mit Zeilenumbruch nach jeder Zeile).
        for (int zeile = 1; zeile <= 3; zeile++) {
            for (int spalte = 1; spalte <= 3; spalte++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Aufgabe 8: break und continue
        // Gib die Zahlen von 1 bis 20 aus, ueberspringe dabei Vielfache von 3 (continue)
        // und breche die Schleife komplett ab, sobald die Zahl 15 erreicht ist (break).
        for (int zahl = 1; zahl <= 20; zahl++) {
            if (zahl == 15) {
                break;
            }
            if (zahl % 3 == 0) {
                continue;
            }
            System.out.println(zahl);
        }

        System.out.println("Fertig! Vergleiche deine Ausgaben mit den erwarteten Werten in den Kommentaren.");
    }
}
