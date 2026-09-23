package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_15_MapHinzufuegenUndLesen {
    public static void main(String[] args) {
        System.out.println("=== Map: Eintraege hinzufuegen und lesen ===");

        Map<String, String> hauptstaedte = new HashMap<>();
        hauptstaedte.put("Deutschland", "Berlin"); // neuer Key wird hinzugefuegt
        hauptstaedte.put("Frankreich", "Paris");
        hauptstaedte.put("Deutschland", "Berlin"); // vorhandener Wert wird "ueberschrieben" (bleibt hier gleich)

        System.out.println("Map: " + hauptstaedte);
        System.out.println("Hauptstadt von Frankreich: " + hauptstaedte.get("Frankreich"));

        // Verhalten bei unbekanntem Key: get() liefert null, wenn der Key
        // nicht existiert.
        String unbekannt = hauptstaedte.get("Italien");
        System.out.println("Hauptstadt von Italien (unbekannt): " + unbekannt);

        // getOrDefault() liefert stattdessen einen von uns festgelegten
        // Standardwert, falls der Key fehlt - so vermeidet man null-Werte.
        String mitStandard = hauptstaedte.getOrDefault("Italien", "unbekannt");
        System.out.println("Hauptstadt von Italien (mit Standardwert): " + mitStandard);

        // Denkfrage: Warum kann ein unbedachter Zugriff auf einen fehlenden
        // Key mit get() zu Fehlern im weiteren Programmverlauf fuehren, wenn
        // man den Rueckgabewert direkt weiterverwendet (z. B. eine Methode
        // darauf aufruft)?
    }
}
