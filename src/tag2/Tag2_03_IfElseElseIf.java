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
        if (note == 1) {
            System.out.println("Sehr gut");
        } else if (note == 2) {
            System.out.println("Gut");
        } else if (note == 3) {
            System.out.println("Befriedigend");
        } else {
            System.out.println("Uebungsbedarf");
        }

        boolean regen = false;
        if (!regen) {
            System.out.println("Perfekt fuer einen Spaziergang.");
        }
    }
}

