package tag2;

public class Tag2_01_Rechenoperatoren {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("=== Rechenoperatoren ===");
        System.out.println("a = " + a + ", b = " + b);

        // Denkfrage: Warum liefert 10 / 3 bei int nicht 3,333..., sondern 3?
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Zuweisungen und Zaehler folgen in eigenen Lektionen.");
    }
}
