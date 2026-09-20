package tag2;

import java.util.Scanner;

public class Tag2_05_BenutzereingabenScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Benutzereingaben mit Scanner ===");
        System.out.print("Wie heisst du? ");
        String name = scanner.nextLine();

        int lieblingsZahl = leseInt(scanner, "Nenne deine Lieblingszahl: ");
        int verdoppelt = lieblingsZahl * 2;

        System.out.println("Hallo " + name + "!");
        System.out.println("Deine Zahl verdoppelt ist: " + verdoppelt);

        if (lieblingsZahl % 2 == 0) {
            System.out.println("Fun Fact: Deine Zahl ist gerade.");
        } else {
            System.out.println("Fun Fact: Deine Zahl ist ungerade.");
        }
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

