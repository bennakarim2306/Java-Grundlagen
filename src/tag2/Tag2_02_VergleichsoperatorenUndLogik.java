package tag2;

public class Tag2_02_VergleichsoperatorenUndLogik {
    public static void main(String[] args) {
        int age = 18;
        int punkte = 72;
        System.out.println("=== Vergleichsoperatoren ===");

        // Denkfrage: Warum ist age != 20 auch dann wahr, wenn age genau 18 ist?
        System.out.println("age >= 18: " + (age >= 18));
        System.out.println("age == 18: " + (age == 18));
        System.out.println("age != 20: " + (age != 20));
        System.out.println("punkte < 50: " + (punkte < 50));

        System.out.println("Logische Operatoren folgen in Tag2_11_BoolscheAusdruecke.");
    }
}
