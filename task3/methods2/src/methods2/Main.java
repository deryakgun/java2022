package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today";
		int newMessage = sum();
		String message3 = giveCity();
		int number = multiplication(5,7);
		int sum = sum2(5,3,7,9,1,4);
		System.out.println(sum);
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int sum() {
		return 5;
	}
	
	public static String giveCity() {
		return "Mardin";
	}
	public static int multiplication(int number1, int number2) {
		return number1 * number2;
	}
	
	//Variable Argumets 
	public static int sum2(int...numbers ) {   
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
	}
}

