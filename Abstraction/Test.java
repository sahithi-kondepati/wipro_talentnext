package automobile.twowheeler;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\n-------------------------\n");

        Honda honda = new Honda();
        System.out.println("Honda Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdPlayer();
        System.out.println("\n-------------------------\n");

        System.out.println("Logan Details:");
        Logan logan = new Logan();
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n-------------------------\n");

        System.out.println("Ford Details:");
        Ford ford = new Ford();
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}
