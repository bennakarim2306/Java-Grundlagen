package tag3;

import java.util.Arrays;

public class Tag3_08_ArraysAlsParameterUndRueckgabewert {
    public static void main(String[] args) {
        System.out.println("=== Arrays als Parameter und Rückgabewert ===");

        int[] noten = {2, 3, 1, 4, 2};
        System.out.println("Vorher: " + Arrays.toString(noten));

        // Ein Array als Parameter zu übergeben, übergibt eine Referenz auf
        // dasselbe Array im Speicher - Änderungen innerhalb der Methode
        // wirken sich also direkt auf das übergebene Array aus.
        erhoeheAlleUmEins(noten);
        System.out.println("Nachher: " + Arrays.toString(noten));

        // Denkfrage: Warum ist "noten" nach dem Methodenaufruf verändert,
        // obwohl wir das Array nicht als Rückgabewert zurückbekommen haben?

        // Eine Methode kann auch ein komplett neues Array zurückgeben.
        int[] verdoppelt = verdoppleAlle(noten);
        System.out.println("Verdoppelte Kopie: " + Arrays.toString(verdoppelt));
        System.out.println("Original bleibt: " + Arrays.toString(noten));

        // Einschränkung: Die Größe eines Arrays kann nachträglich nicht
        // verändert werden. Wer eine wachsende oder schrumpfende Sammlung
        // braucht, wechselt später zu ArrayList (siehe Tag3_09 ff.).
    }

    private static void erhoeheAlleUmEins(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    private static int[] verdoppleAlle(int[] array) {
        int[] ergebnis = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ergebnis[i] = array[i] * 2;
        }
        return ergebnis;
    }

    // ==================== AUFGABE ====================
    // Schreibe eine Methode "setzeAlleAuf(int[] array, int wert)", die jedes
    // Element des übergebenen Arrays auf "wert" setzt (void-Methode, die das
    // Array direkt verändert).
    // Schreibe zusätzlich eine Methode "kopiere(int[] array)", die ein neues
    // Array mit denselben Werten zurückgibt, ohne das Original zu verändern.
    // Probiere beide Methoden in main() aus und überlege dir, wie du prüfen
    // kannst, dass das Original beim Kopieren unverändert bleibt.
}
