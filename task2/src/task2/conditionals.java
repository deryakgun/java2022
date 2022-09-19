package task2;

public class conditionals {
    //Lesson--> 8
	public static void main(String[] args) {
		
		int number = 15;
		//!! if bloğu sadece true olduğunda çalışır
		if(number < 20) {
			System.out.println("number less than 20");
		}
		if(number > 15  ) {  
			System.out.println("number greater than 15");
		}
        
		//Kod bloğunun false olduğunda ne yapılması gerektiğini söylemek için if-else kullanılır.
		if(number > 25) {
			System.out.println("number greater than 25");
		}else {
			System.out.println("number is not greater than 25");		
		}
		
		//else if
		if(number < 20) {
			System.out.println("Number less than 20");
		}else if(number == 20) {
			System.out.println("Number equal to 20");
		}else{
			System.out.println("Number greater than 20");
		}
	}

}
