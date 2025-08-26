package ProgrammingElement.Level1;

public class Universityfee {
    public static void main(String[] args) {
        int fee = 125000;
        float discountpercent = 10.0f;
        float discount = (fee * discountpercent) / 100;
        float finalfee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and the final doscounted fee is INR " + finalfee);
    }
       
}
