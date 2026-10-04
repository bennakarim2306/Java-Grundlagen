package tag2;

import java.util.Scanner;

public class Tag2_08_SelberAendern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Denkfrage: Welche Eingaben machen beispielUnd und beispielOder gleichzeitig wahr?
        int a = leseInt(scanner, "Gib a ein: ");
        int b = leseInt(scanner, "Gib b ein: ");

        System.out.println("=== SelberAendern: Tag 2 ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));

        System.out.println("a ist positiv: " + (a > 0));
        System.out.println("b ist gerade: " + (b % 2 == 0));
        System.out.println("a und b sind verschieden: " + (a != b));

        boolean beispielUnd = a > 10 && b > 5;
        boolean beispielOder = a < 5 || b < 5;
        boolean beispielNicht = !(a == b);

        System.out.println("beispielUnd: " + beispielUnd);
        System.out.println("beispielOder: " + beispielOder);
        System.out.println("beispielNicht: " + beispielNicht);

        int age = leseInt(scanner, "Gib ein Alter ein: ");
        if (age >= 18) {
            System.out.println("Erwachsen");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Kind");
        }

        System.out.print("Waehle einen Modus (easy, normal, hard, expert, training): ");
        String modus = scanner.nextLine().trim().toLowerCase();
        switch (modus) {
            case "easy":
                System.out.println("Leichter Modus aktiv.");
                break;
            case "normal":
                System.out.println("Normaler Modus aktiv.");
                break;
            case "hard":
                System.out.println("Schwerer Modus aktiv.");
                break;
            case "expert":
                System.out.println("Expertenmodus aktiv.");
                break;
            case "training":
                System.out.println("Trainingsmodus aktiv.");
                break;
            default:
                System.out.println("Unbekannter Modus.");
        }

        System.out.println("Super! Aendere weiter und teste erneut.");
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
