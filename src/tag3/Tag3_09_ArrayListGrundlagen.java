package tag3;

import java.util.ArrayList;
import java.util.List;

public class Tag3_09_ArrayListGrundlagen {
    public static void main(String[] args) {
        System.out.println("=== ArrayList und List: Grundlagen ===");

        // Ein Array hat eine feste Groesse. Eine ArrayList ist eine
        // dynamische Collection: Sie kann waehrend der Laufzeit wachsen und
        // schrumpfen.
        int[] festesArray = new int[3]; // Groesse steht von Anfang an fest

        // List ist ein Interface (eine Art Vertrag/Bauplan), ArrayList ist
        // eine konkrete Implementierung davon. Man deklariert meist mit dem
        // Interface-Typ auf der linken Seite:
        List<String> namen = new ArrayList<>();

        // Generics: <String> legt fest, dass diese Liste NUR Strings
        // enthalten darf. Der Compiler prueft das automatisch fuer uns.
        namen.add("Anna");
        namen.add("Tom");
        System.out.println("namen: " + namen);

        List<Integer> zahlen = new ArrayList<>();
        // Wrapper-Klassen: Generics funktionieren nur mit Objekten, nicht mit
        // primitiven Typen wie int. Integer ist die "Objekt-Version" von int,
        // Double die von double usw. Java wandelt int automatisch in Integer
        // um (Autoboxing), wenn wir add(5) statt add(new Integer(5)) schreiben.
        zahlen.add(5);
        zahlen.add(12);
        System.out.println("zahlen: " + zahlen);

        // Denkfrage: Warum kann man in "List<String> namen" keine Zahl mit
        // namen.add(5) hinzufügen, während das bei einem Array mit
        // Object[] theoretisch ginge?
    }
}
