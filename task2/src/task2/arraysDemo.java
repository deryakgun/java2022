package task2;

public class arraysDemo {
    //Lesson-->14
	public static void main(String[] args) {
		String student1 = "Derya";
		String student2 = "Halil";
		String student3 = "Ayşe";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		String[] students = new String [3]; //[3] dizinin kaç elemandan oluştuğunu belirtir
		students[0] = "Derya";
		students[1] = "Halil";
		students[2] = "Ayşe";
		
		for(int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("--------------");
		
		for(String student : students) { //Elemanların veri tipi 'string' içinde 'öğrenci' tutuyor nerede 'öğrenciler'de
										//öğrenciler dizisindeki her bir elemanı gez ve o anki elemana (öğrenci) takma isim ver
		System.out.println(student);
		}
	}

}
