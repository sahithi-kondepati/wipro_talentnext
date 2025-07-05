package wipro_talentnext;

public class command_arguments1 {
	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.out.println("Please provide two command line arguments.");
	            return;
	        }

	        String company = args[0];
	        String location = args[1];

	        System.out.println(company + " Technologies " + location);
	    }
	}

