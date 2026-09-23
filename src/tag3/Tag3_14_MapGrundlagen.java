package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_14_MapGrundlagen {
    public static void main(String[] args) {
        System.out.println("=== Map und HashMap: Grundlagen ===");

        // Eine List speichert Werte in einer Reihenfolge, zugaenglich ueber
        // einen numerischen Index (0, 1, 2, ...).
        // Eine Map speichert Zuordnungen von einem Key (Schluessel) zu einem
        // Value (Wert) - man greift also nicht ueber eine Position, sondern
        // ueber einen eindeutigen Key zu.
        Map<String, Integer> alterVonPersonen = new HashMap<>();
        alterVonPersonen.put("Anna", 28);
        alterVonPersonen.put("Tom", 34);
        alterVonPersonen.put("Lea", 22);

        System.out.println("Map: " + alterVonPersonen);
        System.out.println("Alter von Anna: " + alterVonPersonen.get("Anna"));

        // Jeder Key darf in einer Map nur einmal vorkommen. Fuegt man denselben
        // Key erneut hinzu, wird der alte Wert einfach ueberschrieben.
        alterVonPersonen.put("Anna", 29);
        System.out.println("Alter von Anna nach Update: " + alterVonPersonen.get("Anna"));

        // Denkfrage: Warum waere eine List<Integer> ungeeignet, um "Alter pro
        // Person" zu speichern, wenn man Personen nicht nur ueber ihre
        // Position, sondern ueber ihren Namen wiederfinden moechte?
    }
}
