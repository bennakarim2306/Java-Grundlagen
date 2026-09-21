package tag2;

import java.util.Scanner;

public class Tag2_09_Zuweisungsoperatoren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkte = leseInt(scanner, "Startpunkte: ");

        System.out.println("\n=== Zuweisungsoperatoren ===");
        // Denkfrage: Welcher Startwert wuerde nach allen vier Veraenderungen wieder zum gleichen Wert fuehren?
        punkte += 10;
        System.out.println("Nach += 10: " + punkte);
        punkte -= 3;
        System.out.println("Nach -= 3: " + punkte);
        punkte *= 2;
        System.out.println("Nach *= 2: " + punkte);
        punkte /= 2;
        System.out.println("Nach /= 2: " + punkte);
        System.out.println("Die Operatoren veraendern jeweils den bisherigen Wert.");

        System.out.println("\nQuiz: Was ist kuerzer als 'zahl = zahl + 5'?");
        String antwort = scanner.nextLine().trim();
        System.out.println(antwort.equals("zahl += 5")
                ? "Richtig!" : "Tipp: Der Operator lautet +=.");
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
