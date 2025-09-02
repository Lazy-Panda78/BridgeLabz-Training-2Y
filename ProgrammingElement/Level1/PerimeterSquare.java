package ProgrammingElement.Level1;
import java.util.*;

public class PerimeterSquare {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.printf("The perimeter of the square with side length %.2f is %.2f.%n", side, perimeter);
        sc.close(); 
    } 
    
}
