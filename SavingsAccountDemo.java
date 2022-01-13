
/**
 * This program tests the SavingsAccount class.
 *
 * @author
 * @version
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingsAccountDemo
{
   public static void main(String args[])
   {
      double interestRate;       // Annual interest rate
      double balance;            // Starting balance
      double deposits;           // Amount of deposits for a month
      double withdrawn;          // Amount withdrawn in a month
      double intEarned = 0.0;    // Interest earned
      double totalDeposits = 0;  // Deposit accumulator
      double totalWithdrawn = 0; // Withdrawal accumulator
      int months;                // Months that have passed

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
     
      // Get the starting balance.
      System.out.print("Enter the savings account's " +
                       "starting balance: ");
      balance = keyboard.nextDouble();

      // Get the annual interest rate.
      System.out.print("Enter the savings account's " +
                       "annual interest rate: ");
      interestRate = keyboard.nextDouble();
      
      // Create a SavingsAccount object.
      SavingsAccount savings =
             new SavingsAccount(balance, interestRate);
             
      // Get the number of months that have passed.
      System.out.print("How many months have passed since " +
                       "the account was opened? ");
      months = keyboard.nextInt();

      //System.out.println(savings.getLastInterest());
      
      // Get the deposits and withdrawals for each month.
      for (int i = 1; i <= months; i++)
      {
         // Get the deposits.
         System.out.print("Enter the amount deposited " +
                          "during month " + i + ": ");
         deposits = keyboard.nextDouble();
         //total deposits
         totalDeposits += deposits;

         // Get the withdrawals.
         System.out.print("Enter the amount withdrawn " +
                          "during month " + i + ": ");
         withdrawn = keyboard.nextDouble();
         //total withdrawals
         totalWithdrawn += withdrawn;
         
         // Add the deposits to the account.
         savings.deposit(deposits);
         
         // Subtract the withdrawals.
         savings.withdraw(withdrawn);
         
         // Add the monthly interest.
         savings.addInterest();
         
         // Accumulate the amount of interest earned.
         intEarned += savings.getLastInterest();
      }
      
      // Create a DecimalFormat object for formatting output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Display the totals and the balance.  
      System.out.println("David's Savings Account");  
      System.out.println("Total deposited: $" +
                         dollar.format(totalDeposits));
      System.out.println("Total withdrawn: $" +
                         dollar.format(totalWithdrawn));
      System.out.println("Interest earned: $" +
                         dollar.format(intEarned));
      System.out.println("Ending balance: $" +
                         dollar.format(savings.getBalance()));
   }
}
