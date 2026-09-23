package tag3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tag3_20_DatenstrukturenImVergleich {
    public static void main(String[] args) {
        System.out.println("=== Array, List und Map im Vergleich ===");

        // Array: feste Groesse, Zugriff ueber Index. Gut geeignet, wenn die
        // Anzahl der Elemente von vornherein feststeht und sich nicht mehr
        // aendert.
        int[] wuerfelErgebnisse = new int[6];

        // List / ArrayList: dynamische Groesse, Elemente behalten eine
        // Reihenfolge, Zugriff weiterhin ueber Index moeglich. Gut geeignet,
        // wenn Elemente im Laufe des Programms hinzukommen oder entfernt
        // werden.
        List<String> warteschlange = new ArrayList<>();
        warteschlange.add("Ticket-001");
        warteschlange.add("Ticket-002");

        // Map / HashMap: Zuordnung ueber einen eindeutigen Key, kein
        // klassischer Indexzugriff. Gut geeignet, wenn man Werte nicht ueber
        // eine Position, sondern ueber eine eindeutige Kennung (Name, ID, ...)
        // wiederfinden moechte.
        Map<String, String> statusProTicket = new HashMap<>();
        statusProTicket.put("Ticket-001", "offen");
        statusProTicket.put("Ticket-002", "in Bearbeitung");

        System.out.println("Array-Groesse (fest): " + wuerfelErgebnisse.length);
        System.out.println("Warteschlange (dynamisch): " + warteschlange);
        System.out.println("Status je Ticket (per Key): " + statusProTicket.get("Ticket-001"));

        // Denkfrage: Fuer welche der drei Datenstrukturen wuerdest du dich
        // entscheiden, wenn du...
        //  a) die Namen der 30 Schueler einer festen Klasse speichern willst?
        //  b) eine sich staendig aendernde Liste von Aufgaben (To-dos) fuehrst?
        //  c) zu jeder Schueler-ID die zugehoerige Note nachschlagen willst?
        // Begruende deine Wahl jeweils mit einem Satz.
    }

    // ==================== AUFGABE ====================
    // Ueberlege dir ein kleines eigenes Szenario (z. B. eine Bibliothek, ein
    // Kino, ein Onlineshop) und bilde es mit den passenden Datenstrukturen ab.
    // Dein Programm soll mindestens folgende Operationen zeigen - du
    // entscheidest selbst, ob du dafuer ein Array, eine List oder eine Map
    // verwendest (oder eine Kombination):
    //  - Daten hinzufuegen
    //  - Daten lesen bzw. ausgeben
    //  - einen Wert aendern
    //  - einen Eintrag entfernen
    //  - eine Suche (z. B. "ist etwas vorhanden?")
    //  - eine Filterung anhand einer selbst gewaehlten Bedingung
    // Lagere mindestens zwei dieser Operationen in eigene, sinnvoll benannte
    // Methoden aus, statt alles direkt in main() zu schreiben.
}
