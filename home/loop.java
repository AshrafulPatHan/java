public class loop{
	// larning loop
	public static void main(String []args){
		// while loop
		int i = 0;
		while(i <= 5){
			System.out.println(i);
			i++;
		}

		// do_while loop
		int c = 0;
		do{
			System.out.println(c);
			c++;
		}while(c<=5);

		// for loop
		for (int n = 0;n <=5 ;n++ ) {
			System.out.println(n);
		}

		// for-each Loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (String car : cars) {
		  System.out.println(car);
		}

		// :end

	}
}