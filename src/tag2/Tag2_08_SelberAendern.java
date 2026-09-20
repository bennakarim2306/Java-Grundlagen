package tag2;

import java.util.Scanner;

public class Tag2_08_SelberAendern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Aendere die Startwerte und beobachte die Ausgabe.
        int a = leseInt(scanner, "Gib a ein: ");
        int b = leseInt(scanner, "Gib b ein: ");

        System.out.println("=== SelberAendern: Tag 2 ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));

        // TODO 2: Ersetze die Bedingungen durch eigene Beispiele.
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // TODO 3: Nutze &&, || und ! in eigenen Bedingungen.
        boolean beispielUnd = a > 10 && b > 5;
        boolean beispielOder = a < 5 || b < 5;
        boolean beispielNicht = !(a == b);

        System.out.println("beispielUnd: " + beispielUnd);
        System.out.println("beispielOder: " + beispielOder);
        System.out.println("beispielNicht: " + beispielNicht);

        // TODO 4: Ergaenze else if fuer eine dritte Kategorie.
        int age = leseInt(scanner, "Gib ein Alter ein: ");
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // TODO 5: Erweitere den switch um mindestens zwei weitere Faelle.
        System.out.print("Waehle einen Modus (easy, normal, hard): ");
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
