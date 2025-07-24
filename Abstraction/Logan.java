package automobile.twowheeler;

import automobile.vehicle;

public class Logan extends vehicle {
    public String getModelName() {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() {
        return "MH12 AB4567";
    }

    public String getOwnerName() {
        return "Kiran Rao";
    }

    public int speed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS is ON - Navigating to destination.");
    }
}

