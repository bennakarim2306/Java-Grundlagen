package tag3;

public class Tag3_06_ArraysIteration {
    public static void main(String[] args) {
        System.out.println("=== Arrays durchlaufen: for und for-each ===");

        String[] staedte = {"Berlin", "Hamburg", "München", "Köln"};

        // Klassische for-Schleife: Wir haben Zugriff auf den Index i und
        // können damit z. B. gezielt Elemente ändern oder die Position
        // mit ausgeben.
        System.out.println("-- klassische for-Schleife --");
        for (int i = 0; i < staedte.length; i++) {
            System.out.println("Index " + i + ": " + staedte[i]);
        }

        // for-each: Kürzer, wenn man nur jedes Element lesen möchte und
        // den Index nicht braucht. Man kann damit keine Elemente per Index
        // ändern.
        System.out.println("-- for-each-Schleife --");
        for (String stadt : staedte) {
            System.out.println("Stadt: " + stadt);
        }

        // Denkfrage: In welcher Situation brauchst du unbedingt die
        // klassische for-Schleife statt for-each - zum Beispiel, wenn du
        // ein Element im Array verändern willst?

        int[] punkte = {10, 20, 30};
        for (int i = 0; i < punkte.length; i++) {
            punkte[i] = punkte[i] + 5; // nur mit Index möglich
        }
        System.out.print("punkte nach Änderung: ");
        for (int p : punkte) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
