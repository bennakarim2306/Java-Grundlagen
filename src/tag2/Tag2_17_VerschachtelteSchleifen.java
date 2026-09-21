package tag2;

import java.util.Scanner;

public class Tag2_17_VerschachtelteSchleifen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeilen = leseInt(scanner, "Wie viele Zeilen? ");
        int spalten = leseInt(scanner, "Wie viele Sterne pro Zeile? ");

        System.out.println("\n=== Verschachtelte Schleifen ===");
        // Denkfrage: Welche Schleife musst du aendern, um ein Dreieck statt eines Rechtecks zu zeichnen?
        for (int zeile = 1; zeile <= zeilen; zeile += 1) {
            for (int spalte = 1; spalte <= spalten; spalte += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.print("\nQuiz: Welche Schleife laeuft fuer jede Zeile komplett? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("innen") || antwort.contains("innere")
                ? "Richtig: Die innere Schleife erzeugt alle Spalten."
                : "Tipp: Die innere Schleife laeuft innerhalb jeder Zeile.");
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
                // Die Fehlermeldung wird unten einheitlich ausgegeben.
            }
            System.out.println("Bitte eine Zahl ab 1 eingeben.");
        }
    }
}
