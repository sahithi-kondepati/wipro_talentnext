package automobile.twowheeler;


import automobile.vehicle;

public class Ford extends vehicle {
    public String getModelName() {
        return "Ford Ecosport";
    }

    public String getRegistrationNumber() {
        return "DL05 C1234";
    }

    public String getOwnerName() {
        return "Anil Sharma";
    }

    public int speed() {
        return 110;
    }

    public void tempControl() {
        System.out.println("AC is ON - Temperature set to 22°C.");
    }
}

