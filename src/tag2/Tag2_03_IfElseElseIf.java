package tag2;

public class Tag2_03_IfElseElseIf {
    public static void main(String[] args) {
        int age = 16;

        System.out.println("=== if / else if / else ===");

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        int note = 2;
        // Denkfrage: Was würde passieren, wenn die Prüfung auf Note == 3 vor Note == 2 stünde?
        if (note == 1) {
            System.out.println("Sehr gut");
        } else if (note == 2) {
            System.out.println("Gut");
        } else if (note == 3) {
            System.out.println("Befriedigend");
        } else {
            System.out.println("Übungsbedarf");
        }

        System.out.println("Verschachtelte Bedingungen folgen in Tag2_14_VerschachtelteBedingungen.");
    }
}
