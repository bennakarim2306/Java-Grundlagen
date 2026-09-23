package tag3;

public class Tag3_03_LokaleVariablenUndScope {
    public static void main(String[] args) {
        System.out.println("=== Lokale Variablen und Scope ===");

        int zahl = 10;
        System.out.println("zahl in main: " + zahl);

        // zahl aus main ist hier NICHT sichtbar - verdopple() kennt nur seine
        // eigenen Parameter und lokalen Variablen. main() und verdopple()
        // haben getrennte Method Scopes.
        int verdoppelt = verdopple(zahl);
        System.out.println("verdoppelt: " + verdoppelt);

        // Block Scope: Eine Variable, die innerhalb von { } (z. B. in einem
        // if- oder for-Block) deklariert wird, existiert nur innerhalb dieses
        // Blocks.
        if (zahl > 5) {
            int nachricht = 1;
            System.out.println("Innerhalb des if-Blocks ist nachricht sichtbar: " + nachricht);
        }
        // System.out.println(nachricht); // Würde NICHT kompilieren - nachricht existiert hier nicht mehr.

        for (int i = 0; i < 3; i++) {
            int quadrat = i * i;
            System.out.println("i = " + i + ", quadrat = " + quadrat);
        }
        // System.out.println(i); // Würde NICHT kompilieren - ich gehört nur der for-Schleife.

        // Denkfrage: Warum führt die Wiederverwendung des Namens "i" in einer
        // zweiten, späteren for-Schleife nicht zu einem Konflikt mit der
        // Schleife oben?
        for (int i = 10; i < 12; i++) {
            System.out.println("zweite Schleife, i = " + i);
        }
    }

    private static int verdopple(int wert) {
        int ergebnis = wert * 2;
        return ergebnis;
    }
}
