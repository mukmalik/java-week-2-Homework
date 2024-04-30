package javaWeek2HomeWork;

import java.util.Scanner;

//LeapYear is a class to check if the input if leap year or not
public class Program2LeapYear
{
    public static void methodLeapYear(int a)
    {
        if((a%4==0) && (a%100!=0) || (a%400==0))
        {
            System.out.println(a+" is a leap year");
        }
        else
        {
            System.out.println(a+" is not a leap year");
        }

    }

    public static void main(String[] args)
    {
        Scanner lep = new Scanner(System.in);
        System.out.println("Enter number to check if its leap year");

        int b = lep.nextInt();
        methodLeapYear(b);

    }
}
