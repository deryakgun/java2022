package task2;

public class loopDemo {
	//Lesson --> 11-12-13
	public static void main(String[] args) {

		//for Loop
		for(int i = 1; i <= 10; i++ ) {   
			System.out.println(i);
		}
		System.out.println("For Loop Finished!");
		
		//While Loop
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Loop Finished!");
		
		//Do-While Loop
		int j = 1;
		do {
			System.out.println(j);
			j++;
		}while(j <= 20);
		
		//While ve Do-While farkı:
		//While de şart sağlanmazsa hiç döngüye girmez ama do-while da ise 
		//şart sağlanmazsa bile bir kez döngüye girer 
		
	}

}
