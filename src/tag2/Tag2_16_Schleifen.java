package tag2;

import java.util.Scanner;

public class Tag2_16_Schleifen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = leseInt(scanner, "Bis zu welcher Zahl zaehlen? ");

        System.out.println("\n=== while, do-while und for ===");
        // Denkfrage: Welche Schleife wuerde bei einem Grenzwert 0 trotzdem einmal laufen?
        int whileZaehler = 1;
        while (whileZaehler <= limit) {
            System.out.print(whileZaehler + " ");
            whileZaehler += 1;
        }

        System.out.println("\nDo-while laeuft mindestens einmal:");
        int doZaehler = 1;
        do {
            System.out.print(doZaehler + " ");
            doZaehler += 1;
        } while (doZaehler <= Math.min(limit, 3));

        System.out.println("\nFor-Schleife:");
        for (int forZaehler = 1; forZaehler <= limit; forZaehler += 1) {
            System.out.print(forZaehler + " ");
        }

        System.out.print("\n\nQuiz: Welche Schleife passt besonders gut zu einem bekannten Zaehler? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("for")
                ? "Richtig: for fasst Start, Bedingung und Schritt zusammen."
                : "Die erwartete Antwort ist for.");
    }

    private static int leseInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int wert = Integer.parseInt(scanner.nextLine().trim());
                if (wert >= 1) {
                    return wert;
                }
            } catch (NumberFormatException ignored) {
                // Die naechste Ausgabe erklaert die Eingabe erneut.
            }
            System.out.println("Bitte eine Zahl ab 1 eingeben.");
        }
    }
}
