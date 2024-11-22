package lab.fowcontrlandinhritance;

	// Base class Person
	class Person {
	    // Properties
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display person details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	// Subclass Student
	class Student extends Person {
	    // Additional property
	    private double grade;

	    // Constructor
	    public Student(String name, int age, double grade) {
	        super(name, age); // Call the constructor of the Person class
	        this.grade = grade;
	    }

	    // Method to check if the student has passed
	    public void checkPass() {
	        if (grade >= 60) {
	            System.out.println("Student has passed with a grade of: " + grade);
	        } else {
	            System.out.println("Student has not passed. Grade: " + grade);
	        }
	    }
	

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        // Create a Student object
	        Student student = new Student("Alice", 20, 75.5);

	        // Display student details
	        student.displayDetails();

	        // Check if the student has passed
	        student.checkPass();
	    }

	

	}
	}

