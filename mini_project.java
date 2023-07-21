import java.util.Scanner;

public class mini_project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Health Calculator!");
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age (in years): ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);

        double idealWeight = calculateIdealWeight(height, gender);
        System.out.println("Your ideal body weight is: " + idealWeight + " kg");

        double bmr = calculateBMR(weight, height, age, gender);
        System.out.println("Your Basal Metabolic Rate (BMR) is: " + bmr + " calories per day");

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static double calculateIdealWeight(double height, char gender) {
        double idealWeight;
        if (gender == 'M' || gender == 'm') {
            idealWeight = 50 + 2.3 * ((height * 100) - 152.4);
        } else if (gender == 'F' || gender == 'f') {
            idealWeight = 45.5 + 2.3 * ((height * 100) - 152.4);
        } else {
            throw new IllegalArgumentException("Invalid gender. Please enter M or F.");
        }
        return idealWeight;
    }

    public static double calculateBMR(double weight, double height, int age, char gender) {
        double bmr;
        if (gender == 'M' || gender == 'm') {
            bmr = 66 + (13.7 * weight) + (5 * (height * 100)) - (6.8 * age);
        } else if (gender == 'F' || gender == 'f') {
            bmr = 655 + (9.6 * weight) + (1.8 * (height * 100)) - (4.7 * age);
        } else {
            throw new IllegalArgumentException("Invalid gender. Please enter M or F.");
        }
        return bmr;
    }
}
