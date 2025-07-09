package debugging;



class Student {
	String name;
	int age;
}

public class classDebug {
	public static void main(String[] args) {
		Student s = new Student();
		s.name="adas";
		printStudent(s);
	}

public static void printStudent(Student s) {
	
	System.out.println("Name: " + s.name.toUpperCase()); // 💥NullPointerException
	}
}