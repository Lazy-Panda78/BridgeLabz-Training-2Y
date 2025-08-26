package ProgrammingElement.Level1;
import java.util.*;

public class AreaTriangle {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle with base %.2f and height %.2f is %.2f.%n", base, height, area);
        sc.close();
    }
    
}
