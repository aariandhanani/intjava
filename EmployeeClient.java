package com.suarez;

public class EmployeeClient
{
    public static void main(String [] args)
    {
        Employee [] e = {new Lawyer(5), new Secretary(3), new Marketer(2), new LegalSecretary(72)};

        for (int i = 0; i < e.length; i++)
        {
            System.out.println("Salary: " + e[i].getSalary());
            System.out.println("Vacation Days: " + e[i].getVacationDays());
            System.out.println("Vacation Form: " + e[i].getVacationForm());
            System.out.println();

        }

//        Employee Arush = new Lawyer(200);
//        Employee Matthew = new Secretary(2);
//        printInfo(Arush);
//        printInfo(Matthew);
    }
    public static void printInfo(Employee empl)
    {
        System.out.println("Salary: " + empl.getSalary());
        System.out.println("Vacation Days: " + empl.getVacationDays());
        System.out.println("Vacation Form: " + empl.getVacationForm());
        System.out.println();

    }
}