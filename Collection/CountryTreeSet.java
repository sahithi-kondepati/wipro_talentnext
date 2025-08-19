package Collection;
import java.util.TreeSet;
public class CountryTreeSet {
    TreeSet<String> H1 = new TreeSet<>();
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
        CountryTreeSet c = new CountryTreeSet();
        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("UK");
        System.out.println("Found: " + c.getCountry("USA"));     // should print USA
        System.out.println("Found: " + c.getCountry("Germany")); // should print null
    }
}
