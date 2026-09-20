package tag2;

public class Tag2_01_Rechenoperatoren {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("=== Rechenoperatoren ===");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Reihenfolge der Operationen beachten: * und / vor + und -
        int ergebnis = a + b * 2;
        System.out.println("a + b * 2 = " + ergebnis);

        int punkte = 0;
        punkte += 10; // kurz fuer: punkte = punkte + 10
        punkte -= 3;
        System.out.println("Punkte nach += und -= : " + punkte);

        int counter = 1;
        counter++; // erhoeht um 1
        System.out.println("counter nach ++: " + counter);
    }
}

