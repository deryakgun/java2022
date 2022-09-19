package task2;

public class miniProjeAsalSayı {
	//Lesson -->19
	public static void main(String[] args) {
		
		//Kendi Algoritmam
		int number = 101 ;
		
		if(number == 2) {
			System.out.println("Sayı Asal");
			return;
		}
		if(number == 1  || number ==0) {
			System.out.println("Sayı Asal Değildir");
		}
		for(int i=2; i<number; i++) {
			
			if(number%i==0) {
				System.out.println("Sayı Asal değil");
				break;
			}else {
				System.out.println("Sayı Asal");
				break;
			}
		}
		
		//Engin hoca
		int number2 = -1;
		int remainder = number2 %2;
		boolean isPrime = true;
		
		if(number2 < 1) {
			System.out.println("Invalid number");
			return;
		}
		if(number2 == 1 || number2 == 0) {
			System.out.println("Number2 is not Prime");
			return;
		}
		
		for( int i=2; i<number2; i++) {
			if(number2 % i == 0) {
				isPrime = false;				
			}
		}
		
		if(isPrime) {
			System.out.println("Number2 is prime");
		}else {
			System.out.println("Number2 is not prime");
		}
		
		
		
	}

}
