package tag2;

import java.util.Scanner;

public class Tag2_14_VerschachtelteBedingungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alter = leseInt(scanner, "Alter: ");
        boolean ticket = leseJaNein(scanner, "Ticket vorhanden (ja/nein)? ");

        System.out.println("\n=== Verschachtelte Bedingungen ===");
        // Denkfrage: Warum wird das Alter erst geprueft, wenn ticket wahr ist?
        if (ticket) {
            if (alter >= 18) {
                System.out.println("Einlass: Volljaehriger Gast mit Ticket.");
            } else {
                System.out.println("Einlass: Minderjaehriger Gast mit Ticket.");
            }
        } else {
            System.out.println("Kein Einlass ohne Ticket.");
        }

        System.out.println("\nDie aequivalente kurze Bedingung fuer Volljaehrige lautet:");
        System.out.println("if (ticket && alter >= 18) { ... }");
        System.out.print("Quiz: Welche Bedingung prueft zuerst das Ticket? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("ticket")
                ? "Richtig: Die aeussere if-Bedingung prueft ticket."
                : "Tipp: Aussen steht if (ticket).");
    }

    private static boolean leseJaNein(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().equalsIgnoreCase("ja");
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
