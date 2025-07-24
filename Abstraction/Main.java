package Abstraction;

interface Playable {
    void play();
}
class Veena implements Playable {
    public void play() {
        System.out.println("Playing the Veena (String Instrument).");
    }
}
class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing the Saxophone (Wind Instrument).");
    }
}
public class Main {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        Playable p;
        p = veena;
        p.play();
        p = saxophone;
        p.play();
    }
}
