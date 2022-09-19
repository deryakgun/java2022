package task2;

public class stringDemo {
	//Lesson---> 17-18
	public static void main(String[] args) {
		String message = " The weather is very nice today. ";
		System.out.println(message);
		
		System.out.println("Number of characters :" + message.length());
		System.out.println("5th character :" + message.charAt(4));
		System.out.println(message.concat("Let's go out :)"));
		System.out.println(message.startsWith("B")); //B harfi ile başlıyor mu
		System.out.println(message.endsWith("."));  // . ile bitiyor mu
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0); 
		System.out.println(characters);
		
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		
		System.out.println("----------------------------");
		
		System.out.println(message.replace(' ','-' )); //Boşluk olan yerlere - getirecek
		System.out.println(message.substring(4));
		System.out.println(message.substring(4,11)); 
		
		//Split ile her bir kelimeyi ayırma 
		for(String word : message.split(" ") ) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim()); //cümlenin başındaki ve sondaki boşlukları atar
	}
   //Stringler bir karakter dizisidir
}
