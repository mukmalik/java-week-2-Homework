package javaWeek2HomeWork;

public class Program19_Avg
{
    public static void avgArray() {
        int[] numbers = {1, 2, 3, 4, 5};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println(average);
    }

    public static void main(String[] args)
    {
        avgArray();
    }
}
