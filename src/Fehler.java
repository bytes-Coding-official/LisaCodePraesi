public class Fehler extends Exception {

    public Fehler() {
        super("Besonderer Fehler");
    }

    public Fehler(String message) {
        super(message);
    }

    public void erreicheFehler() throws Fehler {

        System.out.println("jetzt kommt ein fehler!");
        throw new Fehler("das ist ein besonderer fehler");
    }

    public void fehlerAbfangen() {
        try {
            erreicheFehler();
        } catch (Fehler fehler) {
            System.out.println(fehler.getMessage());
        }
    }
}
