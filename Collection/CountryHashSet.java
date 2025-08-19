package Collection;

import java.util.HashSet;
public class CountryHashSet {
    HashSet<String> H1 = new HashSet<>();
    public String saveCountryNames(String countryName) {
        H1.add(countryName);
        return countryName;
    }
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        CountryHashSet c = new CountryHashSet();
        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Canada");
        System.out.println("Found: " + c.getCountry("USA"));      
        System.out.println("Found: " + c.getCountry("Germany")); 
    }
}

