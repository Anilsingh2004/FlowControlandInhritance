import java.util.Scanner;

// Abstract class
abstract class Vaccine {
    protected int age;
    protected String nationality;

    // Constructor to initialize variables
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("You need to pay 250 Rs for the vaccination.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for second dose
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You must complete the first dose before taking the second dose.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("You are eligible for the booster dose after completing the second dose.");
    }
}

// Main class
public class Vaccination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and nationality
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        // Create an instance of VaccinationSuccessful
        VaccinationSuccessful vaccination = new VaccinationSuccessful(age, nationality);

        // Scenario 1: First Dose
        vaccination.firstDose();

        // Assume user completes the first dose
        boolean firstDoseCompleted = nationality.equalsIgnoreCase("Indian") && age >= 18;

        // Scenario 2: Second Dose
        vaccination.secondDose(firstDoseCompleted);

        // Scenario 3: Booster Dose
        vaccination.boosterDose();

        // Close the scanner
        scanner.close();
    }
}