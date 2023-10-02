import java.util.Objects; // for the freestyle feature
import java.util.Scanner;
public class TipCalculator {

    // greeting the user + getting the number of ppl + the tip percentage
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator! ");
        System.out.print("How many people are in your party? ");
        int ppl = scan.nextInt();
        System.out.print("What percentage would you like to tip? (0-100): ");
        int percentTip = scan.nextInt();

       // this code is the while loop that lets the user enter their costs
        double totalCost = 0;
        double number = 2;
        while (number != -1) {
          //  double number = scan.nextDouble();
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (When finished, enter -1): ");
            number = scan.nextDouble();
            totalCost += number;
        }
        totalCost++; // removes the 1 so that it's not included in the total

        System.out.println("------------------------------------");

        // the code below prints the price summaries for the user
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + percentTip + "%");

        // rounding with math.round
        double totalTip = (double) Math.round((((double)percentTip/100) * totalCost) * 100) / 100;
        System.out.println("Total tip: $" + totalTip);

        double totalBillWithTip = (totalCost + totalTip);
        System.out.println("Total bill with tip: $" + totalBillWithTip);

        double perPersonCostBeforeTip = (double) Math.round((totalCost / ppl) * 100) / 100;
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);

        double tipPerPerson = (double) Math.round((totalTip / ppl) * 100) / 100;
        System.out.println("Tip per person: $" + tipPerPerson);

        double totalCostPerPerson = (double) Math.round((totalBillWithTip / ppl) * 100) / 100;
        System.out.println("Total cost per person: $" + totalCostPerPerson);

        // freestyle: note feature
        Scanner scan2 = new Scanner(System.in); // scanner was having issues so I made a new one
        System.out.print("Would you like to leave a note? (yes/no): ");
        String noteYN = scan2.nextLine();
        if (Objects.equals(noteYN, "yes")) {
            System.out.print("Enter your note: ");
            String note = scan2.nextLine();
            System.out.println("Note from customer: " + note);
        } else {

        }
        System.out.println("------------------------------------");
    }
}
