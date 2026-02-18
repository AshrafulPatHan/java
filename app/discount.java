public class discount{
	public static void main(String[] args){
		int age = 60;

		if (age <= 6) {
			System.out.println("free for kids");
		}else if (age < 18) {
			System.out.println("50% discount");
		}else if (18 <= age && age < 60) {
			System.out.println("fill full pament");
		}else if (60 <= age) {
			System.out.println("30% discount");
		}else{
			System.out.println("error!");
		};
	}
}