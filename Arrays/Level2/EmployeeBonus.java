package Arrays.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service: ");
            double yrs = sc.nextDouble();
            
            if (sal <= 0 || yrs < 0) { 
                System.out.println("Invalid input! Enter again.");
                i--; // retry same employee
                continue;
            }
            
            salary[i] = sal;
            years[i] = yrs;
        }
        
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}

