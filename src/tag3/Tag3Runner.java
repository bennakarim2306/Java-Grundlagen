package tag3;

import java.util.Scanner;

public class Tag3Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Deine Wahl: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    Tag3_01_MethodenGrundlagen.main(new String[0]);
                    break;
                case "2":
                    Tag3_02_ParameterUndRueckgabe.main(new String[0]);
                    break;
                case "3":
                    Tag3_03_LokaleVariablenUndScope.main(new String[0]);
                    break;
                case "4":
                    Tag3_04_MethodOverloadingUndMethodenaufrufe.main(new String[0]);
                    break;
                case "5":
                    Tag3_05_ArraysGrundlagen.main(new String[0]);
                    break;
                case "6":
                    Tag3_06_ArraysIteration.main(new String[0]);
                    break;
                case "7":
                    Tag3_07_ArraysAuswertung.main(new String[0]);
                    break;
                case "8":
                    Tag3_08_ArraysAlsParameterUndRueckgabewert.main(new String[0]);
                    break;
                case "9":
                    Tag3_09_ArrayListGrundlagen.main(new String[0]);
                    break;
                case "10":
                    Tag3_10_ArrayListErstellenLesenAendern.main(new String[0]);
                    break;
                case "11":
                    Tag3_11_ArrayListLoeschenPruefenSuchen.main(new String[0]);
                    break;
                case "12":
                    Tag3_12_ArrayListIterationUndFilterung.main(new String[0]);
                    break;
                case "13":
                    Tag3_13_ListenAlsMethodenparameter.main(new String[0]);
                    break;
                case "14":
                    Tag3_14_MapGrundlagen.main(new String[0]);
                    break;
                case "15":
                    Tag3_15_MapHinzufuegenUndLesen.main(new String[0]);
                    break;
                case "16":
                    Tag3_16_MapPruefenUndAendern.main(new String[0]);
                    break;
                case "17":
                    Tag3_17_MapIteration.main(new String[0]);
                    break;
                case "18":
                    Tag3_18_MapSuchenUndFiltern.main(new String[0]);
                    break;
                case "19":
                    Tag3_19_MapAlsMethodenparameter.main(new String[0]);
                    break;
                case "20":
                    Tag3_20_DatenstrukturenImVergleich.main(new String[0]);
                    break;
                case "0":
                    running = false;
                    System.out.println("Bis bald und weiter viel Erfolg beim Coden!");
                    break;
                default:
                    System.out.println("Ungueltige Wahl. Bitte 0-20 eingeben.");
            }

            if (running) {
                System.out.println("\nDruecke Enter fuer das Menue...");
                scanner.nextLine();
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Tag 3 Runner: Methoden, Arrays, Collections ===");
        System.out.println("1) Methoden: Grundlagen");
        System.out.println("2) Parameter und Rueckgabe");
        System.out.println("3) Lokale Variablen und Scope");
        System.out.println("4) Method Overloading und Methodenaufrufe");
        System.out.println("5) Arrays: Grundlagen");
        System.out.println("6) Arrays: Iteration (for / for-each)");
        System.out.println("7) Arrays: Auswertung (min/max/Summe/filtern)");
        System.out.println("8) Arrays als Parameter und Rueckgabewert");
        System.out.println("9) ArrayList und List: Grundlagen");
        System.out.println("10) ArrayList: erstellen, lesen, aendern");
        System.out.println("11) ArrayList: loeschen, pruefen, suchen");
        System.out.println("12) ArrayList: Iteration und Filterung");
        System.out.println("13) Listen als Methodenparameter");
        System.out.println("14) Map und HashMap: Grundlagen");
        System.out.println("15) Map: hinzufuegen und lesen");
        System.out.println("16) Map: pruefen, aendern, loeschen");
        System.out.println("17) Map: Iteration (keySet/values/entrySet)");
        System.out.println("18) Map: suchen und filtern");
        System.out.println("19) Map als Methodenparameter");
        System.out.println("20) Datenstrukturen im Vergleich");
        System.out.println("0) Beenden");
    }
}
