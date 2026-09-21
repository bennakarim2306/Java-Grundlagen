package tag2;

import java.util.Scanner;

public class Tag2_19_Methoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = leseInt(scanner, "Erste Zahl: ");
        int b = leseInt(scanner, "Zweite Zahl: ");

        System.out.println("\n=== Methoden, Parameter, Argumente und return ===");
        // Denkfrage: Warum kann addiere mit beliebigen Zahlen arbeiten, ohne sie fest einzubauen?
        begruesse("Java-Lernende");
        int summe = addiere(a, b);
        System.out.println(a + " + " + b + " = " + summe);
        zeigeErgebnis(summe);

        System.out.print("\nQuiz: Wie heisst der Wert beim Aufruf addiere(a, b)? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("argument")
                ? "Richtig: a und b sind Argumente. In der Methode heissen sie Parameter."
                : "a und b sind Argumente; die empfangenden Variablen sind Parameter.");
    }

    private static void begruesse(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    private static int addiere(int ersteZahl, int zweiteZahl) {
        return ersteZahl + zweiteZahl;
    }

    private static void zeigeErgebnis(int wert) {
        System.out.println("Die void-Methode gibt direkt aus und liefert keinen Wert zurueck.");
    }

    private static int leseInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Bitte eine ganze Zahl eingeben.");
            }
        }
    }
}
