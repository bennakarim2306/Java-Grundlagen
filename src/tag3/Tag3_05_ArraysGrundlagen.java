package tag3;

public class Tag3_05_ArraysGrundlagen {
    public static void main(String[] args) {
        System.out.println("=== Arrays: Grundlagen ===");

        // Ein Array speichert mehrere Werte desselben Typs unter einem Namen.
        // Deklaration (Typ mit []) und Erstellung (new) koennen getrennt
        // oder gemeinsam erfolgen.
        int[] zahlen;
        zahlen = new int[5]; // Erstellung mit fester Groesse 5, alle Werte zunaechst 0

        // Initialisierung mit direkten Werten - die Groesse ergibt sich automatisch.
        int[] alter = {18, 21, 19, 25, 30};

        System.out.println("Groesse von alter (length): " + alter.length);

        // Zugriff auf Elemente ueber den Index - der erste Index ist 0.
        System.out.println("Erstes Element: " + alter[0]);
        System.out.println("Letztes Element: " + alter[alter.length - 1]);

        // Elemente ändern: einfach per Index einen neuen Wert zuweisen.
        alter[2] = 20;
        System.out.println("alter[2] nach Aenderung: " + alter[2]);

        // Denkfrage: Warum ist alter[alter.length - 1] immer das letzte
        // Element, egal wie groß das Array ist?

        // Ein Array hat eine feste Größe: Sie kann nach der Erstellung
        // nicht mehr verändert werden (kein "Element hinzufuegen" möglich).

        // Ein Zugriff außerhalb der gültigen Indizes (0 bis length - 1)
        // führt zu einer ArrayIndexOutOfBoundsException:
        try {
            System.out.println(alter[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Fehler abgefangen: ungültiger Index (" + ex.getMessage() + ")");
        }

        System.out.println("zahlen[0] (unverändert, Standardwert): " + zahlen[0]);
    }
}
