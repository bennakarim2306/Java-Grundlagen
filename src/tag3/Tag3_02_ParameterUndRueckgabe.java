package tag3;

public class Tag3_02_ParameterUndRueckgabe {
    public static void main(String[] args) {
        System.out.println("=== Parameter, Argumente und Rueckgabewerte ===");

        // Eine Methode kann mehrere Parameter besitzen. Beim Aufruf werden
        // die Argumente in genau der Reihenfolge der Parameterliste uebergeben.
        double preis = berechnePreis(3, 2.50);
        System.out.println("Preis fuer 3 Stueck a 2.50 Euro: " + preis);

        // Denkfrage: Was passiert, wenn beim Aufruf die Reihenfolge der
        // Argumente vertauscht wird - berechnePreis(2.50, 3)? Was aendert sich
        // am Ergebnis und warum kompiliert das ueberhaupt (nicht)?

        boolean gross = istGrossbuchstabe('A');
        System.out.println("Ist 'A' ein Grossbuchstabe? " + gross);

        // Methoden koennen auch mehrere Werte aus unterschiedlichen Parametern
        // zu einem einzigen Rueckgabewert verarbeiten.
        int rest = teileMitRest(17, 5);
        System.out.println("17 geteilt durch 5 laesst Rest " + rest);

        // void-Methoden geben keinen Wert zurück - man kann ihr Ergebnis daher
        // nicht in einer Variable speichern.
        zeigeTrennlinie();
    }

    private static double berechnePreis(int anzahl, double einzelpreis) {
        return anzahl * einzelpreis;
    }

    private static boolean istGrossbuchstabe(char zeichen) {
        return Character.isUpperCase(zeichen);
    }

    private static int teileMitRest(int zahl, int teiler) {
        return zahl % teiler;
    }

    private static void zeigeTrennlinie() {
        System.out.println("------------------------------");
    }
}
