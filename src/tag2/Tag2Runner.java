package tag2;

import java.util.Scanner;

public class Tag2Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Deine Wahl: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    Tag2_01_Rechenoperatoren.main(new String[0]);
                    break;
                case "2":
                    Tag2_02_VergleichsoperatorenUndLogik.main(new String[0]);
                    break;
                case "3":
                    Tag2_03_IfElseElseIf.main(new String[0]);
                    break;
                case "4":
                    Tag2_04_SwitchBeispiele.main(new String[0]);
                    break;
                case "5":
                    Tag2_05_BenutzereingabenScanner.main(new String[0]);
                    break;
                case "6":
                    Tag2_06_AbschlussprogrammAlterCheck.main(new String[0]);
                    break;
                case "7":
                    Tag2_07_InteraktiverOperatorTrainer.main(new String[0]);
                    break;
                case "8":
                    Tag2_08_SelberAendern.main(new String[0]);
                    break;
                case "9":
                    runAlles();
                    break;
                case "0":
                    running = false;
                    System.out.println("Bis bald und weiter viel Erfolg beim Coden!");
                    break;
                default:
                    System.out.println("Ungueltige Wahl. Bitte 0-9 eingeben.");
            }

            if (running) {
                System.out.println("\nDruecke Enter fuer das Menue...");
                scanner.nextLine();
            }
        }
    }

    private static void runAlles() {
        Tag2_01_Rechenoperatoren.main(new String[0]);
        Tag2_02_VergleichsoperatorenUndLogik.main(new String[0]);
        Tag2_03_IfElseElseIf.main(new String[0]);
        Tag2_04_SwitchBeispiele.main(new String[0]);
        System.out.println("\nInteraktive Teile bitte ueber Menuepunkte 5-8 starten.");
    }

    private static void printMenu() {
        System.out.println("\n=== Tag 2 Runner: Programme beginnen zu denken ===");
        System.out.println("1) Rechenoperatoren");
        System.out.println("2) Vergleichsoperatoren und Logik");
        System.out.println("3) if / else if / else");
        System.out.println("4) switch");
        System.out.println("5) Benutzereingaben mit Scanner");
        System.out.println("6) Abschlussprogramm: Altercheck");
        System.out.println("7) Interaktiver Operator-Trainer");
        System.out.println("8) SelberAendern-Aufgaben");
        System.out.println("9) Schnell-Demo (alles Nicht-Interaktive)");
        System.out.println("0) Beenden");
    }
}

