package javaWeek2HomeWork;

import java.util.Scanner;

public class Program7_Commission
{

        private String name;
        private double salesGoal;
        private double totalSold;
            public static void calculateCommission(double totalSold)
            {

        double soldValue;
        if (totalSold >= 50000 ) {
            soldValue =(totalSold * .35);
            System.out.println("Sales Amount >=50,000   :"+soldValue);
        }else if(totalSold >= 30000 ){
            soldValue =(totalSold * .20);
            System.out.println("Sales Amount >=30,000  "+soldValue);
        }else if(totalSold >= 20000 ){
            soldValue =(totalSold * .10);
            System.out.println("Sales Amount >=20,000  :"+soldValue);
        }
        else if(totalSold >= 10000 ){
            soldValue =(totalSold * .10);
            System.out.println("Sales Amount >=10,000  :"+soldValue);
        }
        else if(totalSold < 10000 ){
            soldValue =(totalSold * .10);
            System.out.println("Sales Amount <10,000    :"+soldValue);
        }


    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales Amount :  ");
        int v = scan.nextInt();
        calculateCommission(v);

    }




}
