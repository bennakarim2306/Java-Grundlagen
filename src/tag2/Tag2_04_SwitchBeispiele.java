package tag2;

public class Tag2_04_SwitchBeispiele {
    public static void main(String[] args) {
        // Dynamischer Wert sorgt fuer abwechslungsreiche Ausgaben.
        int tag = (int) (Math.random() * 5) + 1;
        String[] faecher = {"java", "mathe", "bio"};
        String fach = faecher[(int) (Math.random() * faecher.length)];

        System.out.println("=== switch ===");
        System.out.println("Zufalls-Tagnummer: " + tag);

        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            default:
                System.out.println("Anderer Tag");
        }

        switch (fach.toLowerCase()) {
            case "java":
                System.out.println("Heute geht es um Entscheidungen im Code.");
                break;
            case "mathe":
                System.out.println("Heute geht es um Gleichungen.");
                break;
            default:
                System.out.println("Spannendes Fach.");
        }
    }
}
