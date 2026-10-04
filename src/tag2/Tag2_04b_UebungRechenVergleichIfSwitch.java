package tag2;

/**
 * Kurzuebung (ca. 15 Minuten) zum Stoff aus Tag2_01 bis Tag2_04:
 * Rechenoperatoren, Vergleichsoperatoren, if/else/else-if, switch.
 *
 * Aufgabe: Die Uebung zeigt fertige Beispiele fuer Rechnen, Vergleichen,
 * if/else-if/else und switch.
 */
public class Tag2_04b_UebungRechenVergleichIfSwitch {
    public static void main(String[] args) {
        System.out.println("=== Uebung: Rechnen, Vergleichen, if/else, switch ===");

        // Aufgabe 1: Rechenoperatoren
        // Berechne Summe, Differenz, Produkt, ganzzahlige Division und Rest von x und y.
        int x = 17;
        int y = 4;
        int summe = x + y;
        int differenz = x - y;
        int produkt = x * y;
        int division = x / y;
        int rest = x % y;
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Division: " + division);
        System.out.println("Rest: " + rest);

        // Aufgabe 2: Vergleichsoperatoren
        // Pruefe, ob "punkte" die Note "bestanden" (>= 50) darstellt.
        int punkte = 47;
        boolean bestanden = punkte >= 50;
        System.out.println("Bestanden: " + bestanden);

        // Aufgabe 3: if / else if / else
        // Bewerte "punkte" in Schulnoten:
        // >= 90 -> "Sehr gut", >= 75 -> "Gut", >= 50 -> "Befriedigend", sonst -> "Nicht bestanden"
        if (punkte >= 90) {
            System.out.println("Sehr gut");
        } else if (punkte >= 75) {
            System.out.println("Gut");
        } else if (punkte >= 50) {
            System.out.println("Befriedigend");
        } else {
            System.out.println("Nicht bestanden");
        }

        // Aufgabe 4: switch
        // Gib fuer die Zahl "monat" (1-12) den passenden Jahreszeitnamen aus:
        // 12, 1, 2 -> "Winter"; 3, 4, 5 -> "Fruehling"; 6, 7, 8 -> "Sommer"; 9, 10, 11 -> "Herbst"
        int monat = 7;
        switch (monat) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Fruehling");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Sommer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Herbst");
                break;
            default:
                System.out.println("Unbekannter Monat");
        }

        System.out.println("Fertig! Vergleiche deine Ausgaben mit den erwarteten Werten in den Kommentaren.");
    }
}

