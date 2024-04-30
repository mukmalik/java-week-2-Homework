package javaWeek2HomeWork;

import java.util.Scanner;

public class Program4_DaysInMonth
{
    public static  boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            return leapYear;
        } else {
            if ((year % 4) == 0  && (year % 100 != 0)) {
                leapYear = true;
            } else if ((year % 100) == 0 && (year % 400 ) == 0 ) {
                leapYear = true;
                System.out.println("is leap year   "+year);
            } else
                System.out.println("is not leap year"+year);
                leapYear = false;
        }

        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int noOfDays = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
                noOfDays = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    noOfDays = 29;
                    System.out.println("getnoof day    "+noOfDays+""+year);
                    break;
                }
                noOfDays = 28;
                System.out.println("getnoof day    "+noOfDays+""+year);
                break;
            case 4: case 6: case 9 : case 11:
                noOfDays = 30;
                System.out.println("getnoof day    "+noOfDays+""+year);
                break;
            default:
                noOfDays = -1;
                System.out.println("getnoof day    "+noOfDays+""+year);
                break;

        }
        return noOfDays;


    }


    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter month");
        int mon = obj.nextInt();
        System.out.println("enter year");
        int yea = obj.nextInt();

        isLeapYear(yea);
        getDaysInMonth(mon,yea);

    }
}
