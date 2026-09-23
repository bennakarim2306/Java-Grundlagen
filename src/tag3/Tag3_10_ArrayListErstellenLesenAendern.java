package tag3;

import java.util.ArrayList;
import java.util.List;

public class Tag3_10_ArrayListErstellenLesenAendern {
    public static void main(String[] args) {
        System.out.println("=== ArrayList: erstellen, lesen, aendern ===");

        List<String> einkaufsliste = new ArrayList<>();
        einkaufsliste.add("Milch");
        einkaufsliste.add("Brot");
        einkaufsliste.add("Butter");

        System.out.println("Liste: " + einkaufsliste);
        System.out.println("Anzahl Eintraege (size): " + einkaufsliste.size());

        // Zugriff ueber Index mit get() - wie beim Array, aber als Methode.
        System.out.println("Erster Eintrag (get(0)): " + einkaufsliste.get(0));

        // Ändern: set() ersetzt den Wert an einer bestehenden Position.
        einkaufsliste.set(1, "Vollkornbrot");
        System.out.println("Nach set(1, ...): " + einkaufsliste);

        // add(index, element) fuegt ein neues Element an einer bestimmten
        // Position ein - alle nachfolgenden Elemente ruecken einen Platz weiter.
        einkaufsliste.add(0, "Kaffee");
        System.out.println("Nach add(0, \"Kaffee\"): " + einkaufsliste);

        // Denkfrage: Was ist der Unterschied zwischen set(index, wert) und
        // add(index, wert) - welche Methode verändert die Größe der Liste
        // und welche nicht?
    }
}
