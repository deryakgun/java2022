package task2;

public class multidimensionalArrayDemo {
    //Lesson---> 16
	public static void main(String[] args) {
		String[][] city = new String[3][3];

		city[0][0] = "Istanbul";
		city[0][1] = "Bursa";
		city[0][2] = "Bilecik";
		city[1][0] = "Ankara";
		city[1][1] = "Konya";
		city[1][2] = "Kayseri";
		city[2][0] = "Diyarbakır";
		city[2][1] = "Mardin";
		city[2][2] = "Şanlıurfa";

		for(int i = 0; i<=2; i++) {
			System.out.println("---------------");
			for(int j = 0; j<=2; j++) {
				System.out.println(city[i][j]);
			}
		}
	
	
	
	}

}
