package tag2;

import java.util.Scanner;

public class Tag2_05_BenutzereingabenScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Benutzereingaben mit Scanner ===");
        System.out.print("Wie heisst du? ");
        String name = scanner.nextLine();

        // Denkfrage: Was passiert, wenn der Benutzer statt einer Zahl "zehn" eingibt?
        int lieblingsZahl = leseInt(scanner, "Nenne deine Lieblingszahl: ");
        int verdoppelt = lieblingsZahl * 2;

        System.out.println("Hallo " + name + "!");
        System.out.println("Deine Zahl verdoppelt ist: " + verdoppelt);

        System.out.println("Die Eingabe wurde gelesen und kann jetzt weiterverarbeitet werden.");
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
