package task2;

public class sayiBulma {
	//Lesson-->23
	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 10;
		boolean varMi = false;
		 
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}				
		}
		if(varMi) {
			System.out.println("Sayı Mevcut");
		}else {
			System.out.println("sayı mevcut değildir");
		}
	
	}
	
}
