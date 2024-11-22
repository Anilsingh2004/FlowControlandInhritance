package lab.fowcontrlandinhritance;

    // Base class User
	class User {
	    // Properties
	    private int id;
	    private String name;

	    // Parameterized constructor
	    public User(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	}

	// Subclass Employee
	class Employee extends User {
	    // Additional property
	    private double salary;

	    // Parameterized constructor
	    public Employee(int id, String name, double salary) {
	        super(id, name); // Call the constructor of the User class
	        this.salary = salary;
	    }

	    // Method to calculate annual salary
	    public double calculateAnnualSalary() {
	        return salary * 12; // Annual salary is monthly salary multiplied by 12
	    }
	}

	// Main class
	 class  Main{
	    public static void main(String[] args) {
	        // Create an Employee object
	        Employee employee = new Employee(1, "John Doe", 3000.00);

	        // Calculate and display the annual salary
	        double annualSalary = employee.calculateAnnualSalary();
	        System.out.println("Annual Salary of " + employee.getName() + " (ID: " + employee.getId() + ") is: $" + annualSalary);
	    }
	
	}


