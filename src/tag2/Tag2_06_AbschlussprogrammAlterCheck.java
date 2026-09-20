package tag2;

import java.util.Scanner;

public class Tag2_06_AbschlussprogrammAlterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Abschlussprogramm: Altercheck ===");
        int age = leseInt(scanner, "Bitte gib dein Alter ein: ");

        if (age < 0 || age > 130) {
            System.out.println("Das Alter wirkt unplausibel. Bitte erneut versuchen.");
            return;
        }

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        System.out.println("Danke! Du hast ein echtes Entscheidungsprogramm gebaut.");
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

