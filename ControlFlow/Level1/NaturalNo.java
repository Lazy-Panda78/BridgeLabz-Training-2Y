package ControlFlow.Level1;
import java.util.Scanner;

public class NaturalNo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  integer: ");
        int number = sc.nextInt();
        int sum =0;
        
        if (number > 0)
        {
            for (int i = 1; i <= number; i++) 
            {
                sum += i;
            }
            System.out.print("The sum of " +number+" natural numbers is: "+sum);
        }
        else 
        {
            System.out.println("The number "+number+" is not a natural number");
        }
        
        sc.close(); 
    }
    
}
