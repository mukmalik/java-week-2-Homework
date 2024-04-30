package javaWeek2HomeWork;

import java.util.Scanner;

public class returnvalue
{
    public static int methodReturn(int a, int b)
    {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter value for a");
        int h = obj.nextInt();


        System.out.println("enter value for b");
        int g = obj.nextInt();
        int value = methodReturn(h,g);
        System.out.println(value);

       // methodReturn(h,g);






    }

}
