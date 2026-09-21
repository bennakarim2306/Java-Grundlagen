package tag2;

import java.util.Scanner;

public class Tag2_12_OperatorPrioritaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Operator-Prioritaet ===");
        System.out.println("Multiplikation und Division werden vor Addition und Subtraktion berechnet.");

        // Denkfrage: Welche Klammern muessten ergaenzt werden, damit beide Ergebnisse gleich sind?
        int ohneKlammer = 2 + 3 * 4;
        int mitKlammer = (2 + 3) * 4;
        System.out.println("2 + 3 * 4 = " + ohneKlammer);
        System.out.println("(2 + 3) * 4 = " + mitKlammer);
        System.out.println("Klammern machen die gewuenschte Reihenfolge sichtbar.");

        System.out.print("\nQuiz: Wie lautet 10 + 6 / 2? Deine Antwort: ");
        String antwort = scanner.nextLine().trim();
        System.out.println(antwort.equals("13")
                ? "Richtig: zuerst 6 / 2, dann + 10."
                : "Die Loesung ist 13. Division kommt zuerst.");
    }
}
