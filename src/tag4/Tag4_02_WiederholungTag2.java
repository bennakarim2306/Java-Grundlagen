package tag4;

import java.util.ArrayList;
import java.util.List;

public class Tag4_02_WiederholungTag2 {
    public static void main(String[] args) {
        System.out.println("=== Tag 4: Wiederholung von Tag 2 ===");


        // This is an array of a String array
        String[][] arr = new String[4][4];

        // Aufgabe 1: Fuehre die fuenf Grundrechenarten aus.
        int a = 17;
        int b = 5;
        int summe = a + b;
        int differenz = a - b;
        int produkt = a * b;
        int division = a / b;
        int rest = a % b;
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Division: " + division);
        System.out.println("Rest: " + rest);

        // Aufgabe 2: Pruefe mit Vergleichsoperatoren, ob die Zahl positiv ist.
        int zahl = 8;
        boolean istPositiv = zahl > 0;
        boolean istKleinerAlsZehn = zahl < 10;
        System.out.println("Ist positiv: " + istPositiv);
        System.out.println("Ist kleiner als zehn: " + istKleinerAlsZehn);

        // Aufgabe 3: Entscheide, ob jemand einen Film sehen darf.
        int alter = 15;
        if (alter >= 12) {
            System.out.println("Film erlaubt");
        } else {
            System.out.println("Film nicht erlaubt");
        }

        // Aufgabe 4: Finde die passende Note.
        int punkte = 78;
        if (punkte >= 90) {
            System.out.println("Sehr gut");
        } else if (punkte >= 75) {
            System.out.println("Gut");
        } else if (punkte >= 50) {
            System.out.println("Bestanden");
        } else {
            System.out.println("Nicht bestanden");
        }

        // Aufgabe 5: Verwende switch fuer eine einfache Wochentagsnummer.
        int wochentag = 2;
        switch (wochentag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Unbekannter Tag");
        }

        // Aufgabe 6: Verwende +=, -= und ++.
        int punkteStand = 10;
        punkteStand += 5;
        punkteStand -= 2;
        punkteStand++;
        System.out.println("PunkteStand: " + punkteStand);

        // Aufgabe 7: Nutze eine for-Schleife fuer die Zahlen 1 bis 5.
        for (int nummer = 1; nummer <= 5; nummer++) {
            System.out.println(nummer);
        }

        // Aufgabe 8: Nutze eine while-Schleife fuer einen Countdown.
        int countdown = 3;
        while (countdown >= 0) {
            System.out.println(countdown);
            countdown--;
        }

        // Aufgabe 9: Gib nur gerade Zahlen von 1 bis 10 aus.
        for (int nummer = 1; nummer <= 10; nummer++) {
            if (nummer % 2 == 0) {
                System.out.println(nummer);
            }
        }

        // Aufgabe 10: Ueberspringe die Zahl 3.
        for (int nummer = 1; nummer <= 5; nummer++) {
            if (nummer == 3) {
                continue;
            }
            System.out.println(nummer);
        }

        // Aufgabe 11: Schreibe eine sehr kleine Methode.
        begruessung();

        // Aufgabe 12: Schreibe eine Methode mit Parameter.
        System.out.println(addiere(3, 4));

        // Aufgabe 13: Schreibe eine Methode mit Rueckgabewert.
        System.out.println(istVolljaehrig(20));

        System.out.println("Ende der Tag-2-Wiederholung.");

        List<Integer> zahlen = new ArrayList<>();

        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);

        zahlen.remove(Integer.valueOf(2));
        System.out.println(zahlen);
    }

    public static void begruessung() {
        System.out.println("Hallo aus der Methode!");
    }

    public static int addiere(int ersteZahl, int zweiteZahl) {
        return ersteZahl + zweiteZahl;
    }

    public static boolean istVolljaehrig(int alter) {
        return alter >= 18;
    }
}
