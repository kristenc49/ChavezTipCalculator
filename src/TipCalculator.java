import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator! ");
        System.out.print("How many people are in your party? ");
        int ppl = scan.nextInt();
        System.out.print("What percentage would you like to tip? (0-100): ");
        int percentTip = scan.nextInt();

       // System.out.print("Enter a cost in dollars and cents, e.g 12.50 (When finished, enter -1):");
        double totalCost = 0;
        double number = 2;
        while (number != -1) {
          //  double number = scan.nextDouble();
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (When finished, enter -1): ");
            number = scan.nextDouble();
            totalCost += number;
        }
        totalCost++;
        System.out.println("------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);

        System.out.println("Total percentage: " + percentTip + "%");

        // find out how to round everything below

        double totalTip = ((double)percentTip/100) * totalCost;
        System.out.println("Total tip: $" + totalTip);

        double totalBillWithTip = (totalCost + totalTip);
        System.out.println("Total bill with tip: $" + totalBillWithTip);

        double perPersonCostBeforeTip = (totalCost / ppl);
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);

        double tipPerPerson = (totalTip / ppl);
        System.out.println("Tip per person: $" + tipPerPerson);

        double totalCostPerPerson = (totalBillWithTip / ppl);
        System.out.println("Total cost per person: $" + totalCostPerPerson);

        System.out.println("------------------------------------");
    }
}
