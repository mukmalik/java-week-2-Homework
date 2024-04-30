package javaWeek2HomeWork;

import java.util.Scanner;

public class Program8_using_ifElse
{
    public static void inputAlph(String a)
    {
        if("A".equals(a))
        {
            System.out.println("Amritsar");
        }
        else if("B".equals(a))
        {
            System.out.println("Bangalore");
        }

        else if ("C".equals(a))
        {
            System.out.println("Chennai");
        }
        else
    {
        System.out.println("wrong");
    }
    }


    public static void main(String[] args)
    {
        Scanner cas = new Scanner(System.in);
        System.out.println("Capital letters input ONLY between A to F TO print city");
        String a = cas.nextLine();


        inputAlph(a);
    }
}