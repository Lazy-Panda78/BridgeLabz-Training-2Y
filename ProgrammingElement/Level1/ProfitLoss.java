package ProgrammingElement.Level1;
public class ProfitLoss {
    public static void main(String[] args) {
        double CP = 129;
        double SP = 191;

        System.out.println("Cost Price: " + CP + " And Selling Price: " + SP);
        if (SP > CP) {
            double profit = SP - CP;
            double profitPercentage = (profit / CP) * 100;
            System.out.println("Profit: " + profit);
            System.out.println("The Profit is INR " +profit+ " And the Profit Percentage is " + profitPercentage + "%");

        }
        else if (CP > SP) {
            double loss = CP - SP;
            double lossPercentage = (loss / CP) * 100;
            System.out.println("Loss: " + loss);
            System.out.println("The Loss is INR " +loss+ " And the Loss Percentage is " + lossPercentage + "%");
        }
    
}
}
