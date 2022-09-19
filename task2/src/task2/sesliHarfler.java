package task2;

public class sesliHarfler {
	//Lesson-->20
	public static void main(String[] args) {
		// Kendi kod satırım
		char harf = 'd';

		char[] kalinSesli = new char[] { 'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u' };
		char[] inceSesli = new char[] { 'E', 'e', 'İ', 'i', 'Ö', 'ö', 'Ü', 'ü' };

		for (int i = 0; i < kalinSesli.length; i++) {
			if (kalinSesli[i] == harf) {
				System.out.println("kalın Sesli harftir");
				break;
			}
		}
		for (int j = 0; j < inceSesli.length; j++) {
			if (inceSesli[j] == harf) {
				System.out.println("ince sesli harftir");
			}else {
				System.out.println("Sesli Harf dışında bir harf girildi!");
				break;
			}
		}

		// Engin hocanın
		char harf2 = 'E';

		switch (harf2) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}
		

	}
}
