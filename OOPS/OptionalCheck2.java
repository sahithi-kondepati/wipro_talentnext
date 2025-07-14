package Oops;

import java.util.Optional;

public class OptionalCheck2 {
    public static void main(String[] args) {
        String address = null;       
        Optional<String> optionalAddress = Optional.ofNullable(address);        
        String finalAddress = optionalAddress.orElse("India");       
        System.out.println("Address: " + finalAddress);
    }
}

