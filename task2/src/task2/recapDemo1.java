package task2;

public class recapDemo1 {
    //Lesson--->9
	public static void main(String[] args) {
	int sayi1 = 20;
	int sayi2 = 25;
	int sayi3 = 2;
	int enBuyuk = sayi1;
	
	if(enBuyuk < sayi2) {
		enBuyuk = sayi2;
	}
    if (sayi2 < sayi3){
	    enBuyuk = sayi3;
	}
    System.out.println("En Büyük Sayi :" + enBuyuk);
		
		
		
	// Kendi algoritmam :)	
		int number1 = 18;
		int number2 = 22;
		int number3 = 32;
				
		if(number1 > number2 && number1 > number3) {
			System.out.println("The largest number is : " + number1);
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("The largest number is : " + number2);
		}else {
			System.out.println("The largest number is :" + number3);
		}
		

	}

}
