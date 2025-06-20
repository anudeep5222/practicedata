package collections;


import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString for easy printing
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class customArraylist {
	public static void main(String[] args) {
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add students
        students.add(new Student(101, "Asha"));
        students.add(new Student(102, "Raj"));
        students.add(new Student(103, "Neha"));

        // Print all students
        System.out.println("All students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Access a student
        System.out.println("First student: " + students.get(0));

        // Update a student
        students.set(1, new Student(104, "Priya"));
        System.out.println("After update:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Remove a student
        students.remove(2); // removes the third student
        System.out.println("After removal:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
