package javaWeek2HomeWork;

import java.util.Scanner;

public class Program8_inPutAlphabet
{
    public static void inputAlph(String a)
    {

        switch (a)
        {
            case "A":
                System.out.println("Amritsar");
                break;
            case "B":
                    System.out.println("Bangalore");
                    break;
            case "C":
                System.out.println("Chennai");
                break;
            case "D":
                System.out.println("DELHI");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Wrong");

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
