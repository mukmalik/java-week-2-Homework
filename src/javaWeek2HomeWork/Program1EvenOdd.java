package javaWeek2HomeWork;

import java.util.Scanner;

//class which is used to check if input is odd or even
public class Program1EvenOdd
{
    //Java static method to check if input is odd or even
    public static void methodOddEven(int a)
    {
        int b = a%2;
        if (b == 0)

        {
            boolean result = true;
            System.out.println(" Is "+a+" even number?  Answer : "+result);
        }
        else
        {
            boolean result = false;
            System.out.println(" Is "+a+" even number?  Answer : "+result);
        }

    }

    public static void main(String[] args)
    {
        Scanner oddEve = new Scanner(System.in);
        System.out.println("Enter a number to check if its odd or Even");

        int v = oddEve.nextInt();
        methodOddEven(v);
    }
}
