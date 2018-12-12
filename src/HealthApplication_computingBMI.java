import java.util.Scanner;

public class HealthApplication_computingBMI {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in); // We need a scanner for input

        /* The task will be done in three steps
        1) Prompt user for input and declare/assign needed variables
        2) calculate essential variables and results
        3) Display the results in print
         */

        // 1) Prompt for input and declare/assign variables
        System.out.print(
                "Please enter weight in pounds: "
        );
        double weight = input.nextDouble();

        System.out.print(
                "Please enter height in inches: "
        );
        double height = input.nextDouble();

        // 2) Calculate results
        double bmi = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);

        // Display results
        System.out.println(
                "Your BMI is: " + bmi
        );
    }
}
