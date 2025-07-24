package automobile.twowheeler;

import automobile.vehicle;

public class Honda extends vehicle {
    public String getModelName() {
        return "Honda Activa";
    }

    public String getRegistrationNumber() {
        return "TS09 AK9876";
    }

    public String getOwnerName() {
        return "Sita Devi";
    }

    public int getSpeed() {
        return 80;
    }

    public void cdPlayer() {
        System.out.println("CD player is ON - playing audio.");
    }
}

