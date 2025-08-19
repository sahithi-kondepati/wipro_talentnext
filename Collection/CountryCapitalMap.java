package Collection;

import java.util.*;
public class CountryCapitalMap {
    HashMap<String, String> M1 = new HashMap<>();
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }
    public static void main(String[] args) {
        CountryCapitalMap obj = new CountryCapitalMap();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        System.out.println("Capital of India: " + obj.getCapital("India"));
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));
        System.out.println("Reverse Map: " + obj.reverseMap());
        System.out.println("All Countries: " + obj.getAllCountries());
    }
}

