package automobile.twowheeler;

import automobile.vehicle;

public class Hero extends vehicle {
    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP31 CD4567";
    }

    public String getOwnerName() {
        return "Ravi Kumar";
    }

    public int getSpeed() {
        return 90;
    }

    public void radio() {
        System.out.println("Radio is ON - playing FM.");
    }
}

