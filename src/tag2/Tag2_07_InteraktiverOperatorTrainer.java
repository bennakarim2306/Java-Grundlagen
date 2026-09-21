package tag2;

import java.util.Scanner;

public class Tag2_07_InteraktiverOperatorTrainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkte = 0;

        System.out.println("=== Operator-Trainer (3 kurze Runden) ===");
        System.out.println("Tipp: Es geht nicht um Tempo, sondern ums Verstehen.");

        // Denkfrage: Warum liefert frage eine Zahl zurueck, statt nur Text auszugeben?
        punkte += frage(scanner, "Runde 1: 10 + 5 = ?", 15);
        punkte += frage(scanner, "Runde 2: 8 * 4 = ?", 32);
        punkte += frage(scanner, "Runde 3: 17 % 3 = ?", 2);

        System.out.println("\nDein Ergebnis: " + punkte + " / 3");

        if (punkte == 3) {
            System.out.println("Perfekt! Du beherrschst die Operatoren sehr gut.");
        } else if (punkte == 2) {
            System.out.println("Stark! Eine kleine Wiederholung und du bist bei 3/3.");
        } else {
            System.out.println("Guter Start! Wiederhole die Beispiele und versuche es nochmal.");
        }
    }

    private static int frage(Scanner scanner, String prompt, int korrekt) {
        int antwort = leseInt(scanner, prompt + " ");
        if (antwort == korrekt) {
            System.out.println("Richtig!");
            return 1;
        }
        System.out.println("Noch nicht richtig. Korrekt waere: " + korrekt);
        return 0;
    }

    private static int leseInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Bitte eine gueltige ganze Zahl eingeben.");
            }
        }
    }
}
