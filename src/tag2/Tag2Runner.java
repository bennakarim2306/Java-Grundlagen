package tag2;

import java.util.Scanner;

public class Tag2Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Denkfrage: Warum muss running veraendert werden, damit das Menue endet?
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
                    Tag2_09_Zuweisungsoperatoren.main(new String[0]);
                    break;
                case "10":
                    Tag2_10_InkrementDekrement.main(new String[0]);
                    break;
                case "11":
                    Tag2_11_BoolscheAusdruecke.main(new String[0]);
                    break;
                case "12":
                    Tag2_12_OperatorPrioritaet.main(new String[0]);
                    break;
                case "14":
                    Tag2_14_VerschachtelteBedingungen.main(new String[0]);
                    break;
                case "16":
                    Tag2_16_Schleifen.main(new String[0]);
                    break;
                case "17":
                    Tag2_17_VerschachtelteSchleifen.main(new String[0]);
                    break;
                case "18":
                    Tag2_18_BreakContinue.main(new String[0]);
                    break;
                case "19":
                    Tag2_19_Methoden.main(new String[0]);
                    break;
                case "20":
                    Tag2_20_Scope.main(new String[0]);
                    break;
                case "21":
                    Tag2_21_MethodOverloading.main(new String[0]);
                    break;
                case "0":
                    running = false;
                    System.out.println("Bis bald und weiter viel Erfolg beim Coden!");
                    break;
                default:
                    System.out.println("Ungueltige Wahl. Bitte 0-21 eingeben.");
            }

            if (running) {
                System.out.println("\nDruecke Enter fuer das Menue...");
                scanner.nextLine();
            }
        }
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
        System.out.println("9) Zuweisungsoperatoren");
        System.out.println("10) ++ und --");
        System.out.println("11) Boolesche Ausdruecke");
        System.out.println("12) Operator-Prioritaet");
        System.out.println("14) Verschachtelte Bedingungen");
        System.out.println("16) Schleifen: while / do-while / for");
        System.out.println("17) Verschachtelte Schleifen");
        System.out.println("18) break und continue");
        System.out.println("19) Methoden");
        System.out.println("20) Lokale Variablen und Scope");
        System.out.println("21) Method Overloading");
        System.out.println("0) Beenden");
    }
}
