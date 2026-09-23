package tag3;

import java.util.HashMap;
import java.util.Map;

public class Tag3_17_MapIteration {
    public static void main(String[] args) {
        System.out.println("=== Map durchlaufen: keySet, values, entrySet ===");

        Map<String, Integer> punkteProSpieler = new HashMap<>();
        punkteProSpieler.put("Anna", 120);
        punkteProSpieler.put("Tom", 95);
        punkteProSpieler.put("Lea", 140);

        // keySet() liefert alle Keys - nuetzlich, wenn man nur die Schluessel
        // braucht oder ueber jeden Key selbst wieder get() aufrufen moechte.
        System.out.println("-- keySet() --");
        for (String name : punkteProSpieler.keySet()) {
            System.out.println("Key: " + name);
        }

        // values() liefert alle Werte, ohne Bezug zu den zugehoerigen Keys.
        System.out.println("-- values() --");
        for (int punkte : punkteProSpieler.values()) {
            System.out.println("Value: " + punkte);
        }

        // entrySet() liefert Key und Value gemeinsam als Map.Entry - das ist
        // meist die praktischste Variante, wenn man beides braucht.
        System.out.println("-- entrySet() --");
        for (Map.Entry<String, Integer> eintrag : punkteProSpieler.entrySet()) {
            System.out.println(eintrag.getKey() + " hat " + eintrag.getValue() + " Punkte");
        }

        // Denkfrage: Warum ist es aufwendiger, ueber keySet() zu iterieren
        // und dann jeweils get(key) aufzurufen, statt direkt entrySet() zu
        // verwenden, wenn man sowohl Key als auch Value braucht?
    }
}
