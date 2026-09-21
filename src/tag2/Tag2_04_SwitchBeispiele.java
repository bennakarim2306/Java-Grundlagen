package tag2;

public class Tag2_04_SwitchBeispiele {
    public static void main(String[] args) {
        int tag = 3;

        System.out.println("=== switch ===");
        // Denkfrage: Was wuerde ohne break nach case 3 zusaetzlich ausgegeben?
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
            default:
                System.out.println("Kein Wochentag aus dem Beispiel.");
        }

        System.out.println("break beendet den passenden case; default behandelt andere Werte.");
    }
}
