package com.suarez;
/*
Aarian Dhanani
3/22/19
The Client Class for a Bank Account
 */

import java.util.Scanner;

public class BankClient
{
    public static void main(String [] args)
    {
        int open = 1;
        int interest = 0;
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.RunProgram();
        while (open == 1)
        {
            System.out.println("Welcome to Very Good Bank. What would you like to do? \n[1]view account \n[2]deposit \n[3]withdraw \n[4]transfer \n[5]exit");

            Scanner choice = new Scanner(System.in);
            int check = choice.nextInt();
            switch(check)
            {
                case 1:

                    bankAccount1.ViewAccount();
                    break;
                case 2:
                    bankAccount1.MakeDeposit();
                    break;
                case 3:
                    bankAccount1.MakeWithdraw();
                    break;
                case 4:
                    bankAccount1.Transfer();
                    break;
                case 5:
                    System.exit(3);
                    break;
                default:
                    System.out.println("Please enter a valid value.");
            }
            if (interest == 3)
            {
                System.out.println("Thank you for using very good bank. You have earned 5% interest on your current balance (" + bankAccount1.balance + ").\nYour new balance is: " + (bankAccount1.balance / 20 + bankAccount1.balance));
                bankAccount1.balance = bankAccount1.balance / 20 + bankAccount1.balance;
            }
            if (bankAccount1.balance == 0)
            {
                System.out.println("Your account balance is 0 and therefore requires a deposit.");
                bankAccount1.MakeDeposit();
            }
            interest++;
        }
    }

}
