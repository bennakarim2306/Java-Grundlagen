package tag2;

import java.util.Scanner;

public class Tag2_18_BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stoppwert = leseInt(scanner, "Bei welcher Zahl soll break stoppen (1-10)? ");

        System.out.println("\n=== break und continue ===");
        // Denkfrage: Was aendert sich, wenn der continue-Block vor den break-Block verschoben wird?
        for (int zahl = 1; zahl <= 10; zahl += 1) {
            if (zahl == 5) {
                continue;
            }
            if (zahl == stoppwert) {
                break;
            }
            System.out.print(zahl + " ");
        }

        System.out.println("\n5 wird uebersprungen, stoppwert beendet die Schleife.");
        System.out.print("Quiz: Was macht continue? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("ueberspring") || antwort.contains("naechst")
                ? "Richtig: continue springt direkt zum naechsten Schleifendurchlauf."
                : "continue ueberspringt den Rest des aktuellen Durchlaufs.");
    }

    private static int leseInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int wert = Integer.parseInt(scanner.nextLine().trim());
                if (wert >= 1 && wert <= 10) {
                    return wert;
                }
            } catch (NumberFormatException ignored) {
                // Die Eingabe wird unten erklaert.
            }
            System.out.println("Bitte eine Zahl von 1 bis 10 eingeben.");
        }
    }
}
