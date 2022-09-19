package task2;

public class mukemmelSayi {
	//Lesson-->21
	public static void main(String[] args) {
				
		//Kendi yaptığım
		int sayi = 15;
		int toplam = 0;
		
		for(int i = 1; i < sayi; i++) {
			if(sayi % i == 0){		
				toplam = toplam + i;					
			}
		}
			if(toplam == sayi) {
				System.out.println(sayi + " : Mukemmel Sayidir");
			}else {
				System.out.println("Mukemmel Sayı değildir");
			}
		
		//Engin hocanın yaptığı ile aynı şekilde yazmışım :)
			int number = 28;
			int total = 0;
			for(int i = 1; i<number; i++) {
				if(number % i == 0) {
					total = total + i;
				}
			}
			if(total == number) {
				System.out.println("Mukemmel sayidir");
			}else {
				System.out.println("Mukemmel sayidir");
			}
			
		
		
	}

}
