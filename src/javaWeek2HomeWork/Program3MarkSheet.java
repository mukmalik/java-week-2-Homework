package javaWeek2HomeWork;

import java.util.Scanner;


public class Program3MarkSheet
{
//  java program to input student details
    public static void perMarks(float m, float s, float e)
    {
        float a =m+s+e;
        System.out.println(a);
        String res;
        //
        float per = (a/300)*100;
        System.out.println("per is "+per);

        if(per>=80)
        {
            System.out.println("80%");
        } else if (per>=60)
        {
            System.out.println("60%");
                        
        } else if (per>=50) {
            System.out.println("50%");
            
        } else if (per>=35) {

            System.out.println("pass");
            res = "pass";

        }
        else
        {
            System.out.println("fail");
            res = "fail";
        }

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        String stName = obj.nextLine();

        System.out.println("enter your roll number  ");
        String stRoll = obj.nextLine();



        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"                     Mark Sheet                    "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"                Name:"+" :               "+stName+"   "+"|");
        System.out.println("                |"+"                Roll:"+" :              "+stRoll+"    "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"             Subjects"+" :                  Marks  "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"                Maths"+" :              "+m+"         "+"|");
        System.out.println("                |"+"              Science"+" :              "+s+"         "+"|");
        System.out.println("                |"+"              English"+" :              "+e+"         "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"              Total  "+" :               "+a+"        "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");
        System.out.println("                |"+"           Percentage"+" :               "+per+"      "+"|");
        System.out.println("                |"+"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"+"|");



    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
//        String stName = obj.nextLine();
//        System.out.println("Enter your name:  ");
//        String stRoll = obj.nextLine();
//        System.out.println("enter your roll number  ");

        System.out.println("enter maths  ");
        float mathsMarks = obj.nextInt();
        if(!(mathsMarks>0&&mathsMarks<=100))
        {
            System.out.println("invalid marks");
        }
        else
        {
            System.out.println("enter maths sci");
            int sciMarks = obj.nextInt();
            if(!(sciMarks>0&&sciMarks<=100))
            {
                System.out.println("invalid marks");
            }
            else
            {
                System.out.println("enter eng");
                int engMarks = obj.nextInt();  System.out.println("enter english  "+engMarks);

                if(!(engMarks>0&&engMarks<=100))
                {
                    System.out.println("invalid marks");
                }
                else
                {
                    perMarks(mathsMarks,sciMarks,engMarks);
                }

            }

        }







    }
}
