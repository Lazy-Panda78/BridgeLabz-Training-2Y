package ProgrammingElement.Level1;

public class PenDistribution {
    public static void main(String[] args) {
        int totalpens= 14;
        int students = 3;
        int studentget = totalpens / students;
        int remainingpens = totalpens % students;

        System.out.println("The pen per student is " + studentget+ " and the remaining pens are " + remainingpens);
    }
    
}
