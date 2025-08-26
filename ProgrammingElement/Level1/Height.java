package ProgrammingElement.Level1;
import java.util.*;

public class Height {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        double heightInches = heightCm / 2.54;
        double heightFeet = heightInches / 12;

        System.out.printf("Your height in cm is %.2f while in feet it is %.2f and in inches it is %.2f.%n", heightCm, heightFeet, heightInches);
        scanner.close();
    }
}
