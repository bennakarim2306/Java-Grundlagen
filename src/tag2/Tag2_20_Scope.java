package tag2;

import java.util.Scanner;

public class Tag2_20_Scope {
    private static final String KURS = "Java Grundlagen";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dein Name: ");
        String name = scanner.nextLine();
        begruesse(name);

        System.out.println("\n=== Lokale Variablen und Scope ===");
        // Denkfrage: Warum kann main auf name zugreifen, begruesse aber nicht auf diese lokale Variable?
        System.out.println("Die Konstante KURS ist in allen Methoden dieser Klasse sichtbar: " + KURS);
        System.out.println("name ist nur in main sichtbar. Die Methode begruesse erhaelt eine eigene lokale Variable.");
        System.out.println("Eine Variable innerhalb einer if- oder Schleifen-Klammer bleibt in diesem Block.");

        System.out.print("\nQuiz: Wo ist eine lokale Variable sichtbar? ");
        String antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println(antwort.contains("methode") || antwort.contains("block")
                ? "Richtig: Ihr Scope reicht nur bis zum Ende ihres Blocks."
                : "Tipp: Lokale Variablen gelten nur in ihrer Methode bzw. ihrem Block.");
    }

    private static void begruesse(String name) {
        String nachricht = "Hallo " + name + "!";
        System.out.println(nachricht);
    }
}
