import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your party?");
        String ppl = scan.nextLine();
        System.out.print("What percentage would you like to tip? (0-100):");
        int percentTip = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g 12.50 (When finished, enter -1):");
        double totalCost = 0;
        double number = scan.nextDouble();
        while (number != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (When finished, enter -1): ");
            number = scan.nextDouble();
            totalCost += number;
            if (number == -1) {
                totalCost--;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);

    }
}
