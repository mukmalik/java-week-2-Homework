package javaWeek2HomeWork;

import java.util.Scanner;

public class Program16_CheckNumber
{
    public static void checkNumber(int a)
    {
        if(a>0)
        {
            System.out.println("number is positive :"+a);

        } else if (a<0)
        {
            System.out.println("number is negative :"+a);
        }
        else
        {
            System.out.println("Number is zero"+a);
        }
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to check");
        int num = scan.nextInt();

        checkNumber(num);
    }
}
