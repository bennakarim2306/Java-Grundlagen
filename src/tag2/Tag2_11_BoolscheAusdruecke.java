package tag2;

import java.util.Scanner;

public class Tag2_11_BoolscheAusdruecke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean darfRein = leseJaNein(scanner, "Darf die Person hinein (ja/nein)? ");
        boolean hatTicket = leseJaNein(scanner, "Ist ein Ticket vorhanden (ja/nein)? ");

        System.out.println("\n=== Boolesche Ausdruecke ===");
        // Denkfrage: In welchem Fall liefern && und || denselben Wahrheitswert?
        System.out.println("Beide Bedingungen mit &&: " + (darfRein && hatTicket));
        System.out.println("Mindestens eine mit ||: " + (darfRein || hatTicket));
        System.out.println("Umgekehrter Ticketwert mit !: " + (!hatTicket));

        System.out.print("\nQuiz: Welcher Operator verlangt, dass beide Werte true sind? ");
        String antwort = scanner.nextLine().trim();
        System.out.println(antwort.contains("&&")
                ? "Richtig!" : "Die Antwort ist &&.");
    }

    private static boolean leseJaNein(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().equalsIgnoreCase("ja");
    }

}
