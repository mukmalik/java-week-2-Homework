package javaWeek2HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program17_SortArray
{

    public static void stringSort()
    {
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
        // sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }

    public static void numericSort()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size for array");
        int count = obj.nextInt();
        int a[] = new int[count];

        System.out.println("Enter elements for array");
        for (int i=0;i<count;i++)
        {
            a[i] =obj.nextInt();
        }
        for (int i=0;i<count;i++)
        {
            for (int j=i+1;j<count;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in decending order ");
        for (int i=0;i<count-1;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(a[count-1]);


    }


    public static void main(String[] args)
    {
        numericSort();
        stringSort();
    }

}
