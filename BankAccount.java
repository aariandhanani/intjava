package com.suarez;
import java.util.*;
/*
Aarian Dhanani
3/22/19
The Object Class for a Bank Account
 */

import java.util.Scanner;

public class BankAccount {
    //Variables
    public String name;
    public int accountNumber;
    public int accountNumber2 = 1;
    public int type;
    public int balance;
    public int balance2;
    public String typeName;

    //Set up
    public BankAccount(String name1, int accountNumber1, int type1)
    {
        name = name1;
        accountNumber = accountNumber1++;
        type = type1;
    }
    public BankAccount(){
        name = "";
        accountNumber = 0;
        type = 0;
    }
    public String getname()
    {
        return name;
    }
    public int getaccountNumber()
    {
        return accountNumber;
    }
    public int gettype()
    {
        return type;
    }

    public void setName(String name1)
    {
        name = name1;
    }

    public void setaccountNumber(int accountNumber1)
    {
        accountNumber = accountNumber1;
    }

    public void setType(int type1)
    {
        type = type1;
    }

    //runs at the beginning of the program
    public void RunProgram()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your bank account. To open your account, please answer the following questions:");
        System.out.println("What is you name?");
        name = scan.next();
        System.out.println("What type of account would you like? \n[1]savings \n[2]checking");
        int type = scan.nextInt();
        switch (type)
        {
            case 1:
                typeName = "Savings";
                break;
            case 2:
                typeName = "Checking";
                break;
            default:
                System.out.println("Please enter a valid value.");
        }
        System.out.println("Thank you. Your account balance has now been set to 0. Your account number is: " +accountNumber);
        balance = 0;
    }

    //toString method
    public void ViewAccount()
    {
        System.out.println(name + "'s account: \nAccount number: " + accountNumber + "\nAccount type: " + typeName + "\nBalance in account: " + balance);
    }

    //Make deposit
    public void MakeDeposit()
    {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("You may now make a deposit. Please note that any balance under $200 will result a fine of half of the funds in your account.");
        System.out.println("How much would you like to deposit?");
        int moneyAmount = scan2.nextInt();
        System.out.println("Please enter your name.");
        String nameCheck = scan2.next();
        System.out.println("Please enter your account number to finalize the process.");
        int numberCheck = scan2.nextInt();
        System.out.println(nameCheck + " " + numberCheck);
        //balance = moneyAmount; just to fix a bug i had found earlier
        if (nameCheck.equals(name) && numberCheck == accountNumber)
        {
            System.out.println("Your transaction has been approved. Here is a report of your transaction: \nBalance Before Transaction: " + balance + "\nBalance After Transaction: " + (balance + moneyAmount));
            balance = balance + moneyAmount;
            if (balance < 200)
            {
                Fee();
            }
        }
        else
        {
            System.out.println("You entered the information incorrectly");
        }
    }

    public void Fee()
    {
        System.out.println("You broke the rules and have less than $200 in your account. We will now take half of your balance.");
        balance = balance/2;
        System.out.println("Your new balance is: " + balance);
    }

    public void MakeWithdraw()
    {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("You may now make a withdraw. Please note that any balance under $200 will result a fine of half of the funds in your account.");
        System.out.println("How much would you like to withdraw? You have " + balance + " in your account");
        int moneyAmount = scan2.nextInt();
        System.out.println("Please enter your name.");
        String nameCheck = scan2.next();
        System.out.println("Please enter your account number to finalize the process.");
        int numberCheck = scan2.nextInt();
        if (balance < moneyAmount)
        {
            System.out.println("You may not withdraw an amount less than the funds in your account.");
        }
        else
        {
            if (nameCheck.equals(name) && numberCheck == accountNumber)
            {
                System.out.println("Your transaction has been approved. Here is a report of your transaction: \nBalance Before Transaction: " + balance + "\nBalance After Transaction: " + (balance - moneyAmount));
                balance = balance - moneyAmount;
                if (balance < 200)
                {
                    Fee();
                }
            }
            else
            {
                System.out.println("You entered the information incorrectly");
            }
        }
    }

    public void Transfer()
    {
        int transferStart = 0;
        Scanner scan2 = new Scanner(System.in);
        if (transferStart == 0)
        {
            System.out.println("Welcome to the transfer section. You may now transfer funds to your new account that has been made. Details: \nAccount name: " + name + "\nAccount number: " + accountNumber2 + "\nAccount type: " + typeName + "\nBalance in account: " + balance2);
            transferStart = 1;
        }
        System.out.println("How much would you like to transfer? You have " + balance + " in your account");
        int moneyAmount = scan2.nextInt();
        System.out.println("Please enter your name.");
        String nameCheck = scan2.next();
        System.out.println("Please enter your account number to finalize the process.");
        int numberCheck = scan2.nextInt();
        if (balance < moneyAmount)
        {
            System.out.println("You may not transfer an amount less than the funds in your account.");
        }
        else
        {
            if (nameCheck.equals(name) && numberCheck == accountNumber)
            {
                System.out.println("Your transaction has been approved. Here is a report of your transaction: \nBalance Before Transaction: " + balance + "\nBalance After Transaction: " + (balance - moneyAmount));
                balance = balance - moneyAmount;
                balance2 = balance2 +moneyAmount;
                System.out.println("Your 2nd account's balance is: " + balance2);
                if (balance < 200)
                {
                    Fee();
                }
            }
            else
            {
                System.out.println("You entered the information incorrectly");
            }
        }
    }
    @Override
    public boolean equals (Object x)
    {
        if(x instanceof BankAccount)
        {
            BankAccount g = (BankAccount)x;
            if (name.equals(g.name) && accountNumber == g.accountNumber && type == g.type){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("The object must be of type Television Channel");
            return false;
        }
    }
}
