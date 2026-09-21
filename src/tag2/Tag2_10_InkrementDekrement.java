package tag2;

import java.util.Scanner;

public class Tag2_10_InkrementDekrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = leseInt(scanner, "Startwert des Zaehlers: ");

        System.out.println("\n=== ++ und -- ===");
        System.out.println("counter: " + counter);
        // Denkfrage: Warum unterscheiden sich die Ausgaben von wert++ und ++wert?
        counter++;
        System.out.println("Nach counter++: " + counter);
        counter--;
        System.out.println("Nach counter--: " + counter);

        int wert = counter;
        System.out.println("wert++ gibt zuerst " + wert++ + " aus.");
        System.out.println("Danach ist wert: " + wert);
        System.out.println("++wert gibt zuerst " + (++wert) + " aus.");

        System.out.print("\nQuiz: Zaehler um eins erhoehen (++, ++wert oder += 1): ");
        String antwort = scanner.nextLine().trim();
        System.out.println(antwort.contains("++") || antwort.contains("+= 1")
                ? "Richtig: Alle drei Varianten sind moeglich."
                : "Noch einmal: counter++ erhoeht den Zaehler um eins.");
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
