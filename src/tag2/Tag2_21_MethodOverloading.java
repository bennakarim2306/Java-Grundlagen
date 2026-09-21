package tag2;

import java.util.Scanner;

public class Tag2_21_MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ganzzahl = leseInt(scanner, "Eine Ganzzahl: ");
        double kommazahl = leseDouble(scanner, "Eine Kommazahl: ");

        System.out.println("\n=== Method Overloading ===");
        // Denkfrage: Wie entscheidet Java, welche format-Methode zum Argument passt?
        System.out.println("format(" + ganzzahl + "): " + format(ganzzahl));
        System.out.println("format(" + kommazahl + "): " + format(kommazahl));
        System.out.println("format(\"Java\"): " + format("Java"));
        System.out.println("Gleicher Methodenname, unterschiedliche Parameterliste.");

        System.out.print("\nQuiz: Was unterscheidet ueberladene Methoden? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("parameter")
                ? "Richtig: Anzahl, Typ oder Reihenfolge der Parameter unterscheidet sie."
                : "Die Parameterliste (Typ, Anzahl oder Reihenfolge) muss verschieden sein.");
    }

    private static String format(int wert) {
        return "Ganzzahl " + wert;
    }

    private static String format(double wert) {
        return String.format(java.util.Locale.US, "Kommazahl %.2f", wert);
    }

    private static String format(String wert) {
        return "Text " + wert;
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

    private static double leseDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException ex) {
                System.out.println("Bitte eine Kommazahl eingeben.");
            }
        }
    }
}
