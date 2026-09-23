package tag3;

import java.util.ArrayList;
import java.util.List;

public class Tag3_12_ArrayListIterationUndFilterung {
    public static void main(String[] args) {
        System.out.println("=== ArrayList durchlaufen und filtern (ohne Streams) ===");

        List<Integer> punkte = new ArrayList<>();
        punkte.add(45);
        punkte.add(72);
        punkte.add(30);
        punkte.add(90);
        punkte.add(55);

        // Klassische for-Schleife mit Index - nuetzlich, wenn man die
        // Position kennen oder gezielt Elemente ersetzen moechte.
        System.out.println("-- klassische for-Schleife --");
        for (int i = 0; i < punkte.size(); i++) {
            System.out.println("Index " + i + ": " + punkte.get(i));
        }

        // for-each greift direkt auf die Elemente zu, ohne Umweg ueber get(i).
        System.out.println("-- for-each --");
        for (int wert : punkte) {
            System.out.println("Wert: " + wert);
        }

        // Denkfrage: Wann ist punkte.get(i) im Vergleich zu direktem Zugriff
        // per for-each notwendig - zum Beispiel, wenn man mit set(i, ...)
        // einen Wert veraendern will?

        // Filtern ohne Streams: Liste durchlaufen, Bedingung pruefen, passende
        // Elemente in eine neue Ergebnisliste uebernehmen.
        List<Integer> bestandenePunkte = new ArrayList<>();
        for (int wert : punkte) {
            if (wert >= 50) {
                bestandenePunkte.add(wert);
            }
        }
        System.out.println("Punkte >= 50: " + bestandenePunkte);

        // Erstes passendes Element finden
        Integer ersterTreffer = null;
        for (int wert : punkte) {
            if (wert > 80) {
                ersterTreffer = wert;
                break;
            }
        }
        System.out.println("Erster Wert > 80: " + ersterTreffer);

        // Passende Elemente zaehlen
        int anzahlUeber50 = 0;
        for (int wert : punkte) {
            if (wert >= 50) {
                anzahlUeber50++;
            }
        }
        System.out.println("Anzahl Werte >= 50: " + anzahlUeber50);
    }

    // ==================== AUFGABE ====================
    // Erstelle eine eigene List<String> mit mindestens 6 Namen deiner Wahl.
    // Schreibe dir dazu (in main oder in eigenen Methoden):
    //  - eine Schleife, die alle Namen ausgibt, die mit einem bestimmten
    //    Buchstaben beginnen (Bedingung selbst ueberlegen, z. B. startsWith).
    //  - eine neue Ergebnisliste mit genau diesen gefilterten Namen.
    //  - eine Zaehlung, wie viele Namen laenger als 4 Zeichen sind.
    //  - eine Suche nach dem ersten Namen, der eine von dir gewaehlte
    //    Bedingung erfuellt.
}
