package ProgrammingElement.Level1;
import java.util.*;

public class KmToMile {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;

        System.out.printf(" The Total miles is : "+miles+" mile for the given "+km + "Km");
        sc.close();
    }
    
}
