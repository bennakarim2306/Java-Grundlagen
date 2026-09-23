package tag3;

import java.util.ArrayList;
import java.util.List;

public class Tag3_11_ArrayListLoeschenPruefenSuchen {
    public static void main(String[] args) {
        System.out.println("=== ArrayList: loeschen, pruefen, suchen ===");

        List<String> teilnehmer = new ArrayList<>();
        teilnehmer.add("Anna");
        teilnehmer.add("Tom");
        teilnehmer.add("Lea");
        teilnehmer.add("Tom"); // Tom kommt hier bewusst doppelt vor
        System.out.println("Liste: " + teilnehmer);

        // remove(int index) loescht das Element an dieser Position.
        teilnehmer.remove(0);
        System.out.println("Nach remove(0): " + teilnehmer);

        // remove(Object object) loescht das ERSTE Vorkommen dieses Werts.
        teilnehmer.remove("Tom");
        System.out.println("Nach remove(\"Tom\"): " + teilnehmer);

        // Denkfrage: teilnehmer.remove(1) und teilnehmer.remove("Lea") koennten
        // je nach aktuellem Listeninhalt dasselbe oder etwas komplett anderes
        // bewirken - warum ist das bei einer Liste mit Integer-Werten wie
        // List<Integer> besonders leicht zu verwechseln (remove(1) vs. remove(Integer.valueOf(1)))?

        System.out.println("isEmpty: " + teilnehmer.isEmpty());
        System.out.println("contains(\"Lea\"): " + teilnehmer.contains("Lea"));
        System.out.println("indexOf(\"Lea\"): " + teilnehmer.indexOf("Lea"));
        System.out.println("indexOf(\"Max\") (nicht vorhanden): " + teilnehmer.indexOf("Max"));

        teilnehmer.clear();
        System.out.println("Nach clear(): " + teilnehmer + ", isEmpty: " + teilnehmer.isEmpty());
    }

    // ==================== AUFGABE ====================
    // Erstelle in einer eigenen main-unabhaengigen Methode oder direkt in
    // main() eine List<Integer> mit mindestens 6 selbst gewaehlten Zahlen,
    // von denen manche mehrfach vorkommen.
    // Probiere damit aus:
    //  - Entferne eine Zahl anhand ihres Werts (nicht anhand des Index).
    //  - Pruefe mit contains(), ob eine bestimmte Zahl noch enthalten ist.
    //  - Finde mit indexOf() die Position einer Zahl.
    //  - Leere die Liste am Ende komplett und gib isEmpty() aus.
}
