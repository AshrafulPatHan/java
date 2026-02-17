public class if_else{
	// if else condition
	public static void main(String []args){
		boolean isRaining = true;

		// method 1
		if (20 > 18) {
		  	System.out.println("20 is greater than 18");
		}

		// method 2
		if (isRaining){
			System.out.println("Bring an Umbrealla");
		} else {
		  	System.out.println("No rain today, no need for an umbrella!");
		}

		// method 3
		int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

		if (weather == 1) {
		  System.out.println("Bring an umbrella.");
		} else if (weather == 2) {
		  System.out.println("Wear sunglasses.");
		} else {
		  System.out.println("Just go outside normally.");
		}

		// method 4
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

		// method 5
		int aeg = 12;
		String Rmessage = (aeg <= 12) ? "hello kid."
		               : (aeg < 18) ? "Good day."
		               : "hello sir.";
		System.out.println(Rmessage);
	} 
}