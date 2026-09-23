package tag3;

public class Tag3_07_ArraysAuswertung {
    public static void main(String[] args) {
        System.out.println("=== Arrays auswerten: suchen, min/max, Summe, Durchschnitt ===");

        int[] werte = {12, 45, 3, 67, 22, 8, 91, 30};

        // Prüfen, ob ein Wert vorhanden ist
        boolean enthaelt45 = enthaeltWert(werte, 45);
        System.out.println("Enthaelt 45? " + enthaeltWert(werte, 45));
        System.out.println("Enthaelt 100? " + enthaeltWert(werte, 100));

        // Minimum und Maximum bestimmen
        System.out.println("Minimum: " + minimum(werte));
        System.out.println("Maximum: " + maximum(werte));

        // Summe und Durchschnitt berechnen
        int summe = summe(werte);
        System.out.println("Summe: " + summe);
        System.out.println("Durchschnitt: " + (summe / (double) werte.length));

        // Elemente anhand einer Bedingung zaehlen (hier: groesser als 30)
        System.out.println("Anzahl Werte > 30: " + zaehleGroesserAls(werte, 30));

        // Denkfrage: Warum liefert enthaeltWert(45) true, obwohl wir das
        // Array nicht sortiert haben - reicht eine einfache Schleife dafuer?

        // Elemente anhand einer Bedingung filtern: Wir sammeln die passenden
        // Werte zunaechst in einem Hilfsarray mit maximal moeglicher Groesse
        // und schneiden es danach auf die tatsaechliche Anzahl zurecht.
        int[] grosseWerte = filterGroesserAls(werte, 30);
        System.out.print("Werte > 30: ");
        for (int w : grosseWerte) {
            System.out.print(w + " ");
        }
        System.out.println();
    }

    private static boolean enthaeltWert(int[] array, int gesucht) {
        for (int wert : array) {
            if (wert == gesucht) {
                return true;
            }
        }
        return false;
    }

    private static int minimum(int[] array) {
        int kleinster = array[0];
        for (int wert : array) {
            if (wert < kleinster) {
                kleinster = wert;
            }
        }
        return kleinster;
    }

    private static int maximum(int[] array) {
        int groesster = array[0];
        for (int wert : array) {
            if (wert > groesster) {
                groesster = wert;
            }
        }
        return groesster;
    }

    private static int summe(int[] array) {
        int summe = 0;
        for (int wert : array) {
            summe += wert;
        }
        return summe;
    }

    private static int zaehleGroesserAls(int[] array, int grenze) {
        int anzahl = 0;
        for (int wert : array) {
            if (wert > grenze) {
                anzahl++;
            }
        }
        return anzahl;
    }

    private static int[] filterGroesserAls(int[] array, int grenze) {
        int anzahl = zaehleGroesserAls(array, grenze);
        int[] ergebnis = new int[anzahl];
        int index = 0;
        for (int wert : array) {
            if (wert > grenze) {
                ergebnis[index] = wert;
                index++;
            }
        }
        return ergebnis;
    }

    // ==================== AUFGABE ====================
    // Schreibe eine eigene Methode "zaehleGeradeZahlen(int[] array)", die
    // zurückgibt, wie viele gerade Zahlen im Array vorkommen.
    // Schreibe außerdem eine Methode "filterGerade(int[] array)", die ein
    // neues Array mit nur den geraden Zahlen zurückgibt (orientiere dich am
    // Aufbau von zaehleGroesserAls/filterGroesserAls oben, aber denke dir die
    // Bedingung selbst aus).
    // Teste beide Methoden in main() mit einem selbst gewählten Array.
}
