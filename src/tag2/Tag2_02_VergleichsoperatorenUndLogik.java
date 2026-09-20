package tag2;

public class Tag2_02_VergleichsoperatorenUndLogik {
    public static void main(String[] args) {
        int age = 18;
        int punkte = 72;
        boolean hatAusweis = true;

        System.out.println("=== Vergleichsoperatoren und logische Operatoren ===");

        System.out.println("age >= 18: " + (age >= 18));
        System.out.println("age == 18: " + (age == 18));
        System.out.println("age != 20: " + (age != 20));
        System.out.println("punkte < 50: " + (punkte < 50));

        // && bedeutet: beide Bedingungen muessen true sein.
        boolean darfRein = age >= 18 && hatAusweis;
        System.out.println("darfRein (age >= 18 && hatAusweis): " + darfRein);

        // || bedeutet: mindestens eine Bedingung muss true sein.
        boolean bonus = punkte >= 90 || age < 18;
        System.out.println("bonus (punkte >= 90 || age < 18): " + bonus);

        // ! kehrt einen boolean um.
        boolean keinAusweis = !hatAusweis;
        System.out.println("!hatAusweis: " + keinAusweis);
    }
}

