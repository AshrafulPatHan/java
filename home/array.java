public class array{
	// array method
	public static void main(String []args){
		// --- string array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 

		System.out.println(cars[0]); // print one value of array

		// pring full value of array
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}

		// --- number array
		int[] numbers = {1, 5, 10, 25};
		int sum = 0;

		// Loop through the array and add each element to sum
		for (int i = 0; i < numbers.length; i++) {
		  sum += numbers[i];
		}

		System.out.println("The sum is: " + sum);

		// --- multidimensional array
		int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
		System.out.println(myNumbers[1][2]); // Outputs 8
	}
}
	