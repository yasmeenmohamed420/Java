import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println( "please enter numbers : ");
        Scanner scane = new Scanner(System.in);

        while (true)
        {
            int num1 = scane.nextInt();
            int num2 = scane.nextInt();
            int num3 = scane.nextInt();
            int num4 = scane.nextInt();

            if ((num1 == num2) && (num2 == num3) && (num3 == num4))
            {
                System.out.println( "All numbers are equal");
            }
            else if ((num1 != num2) && (num1 != num3) && (num1 != num4) && (num2 != num3) && (num2 != num4) && (num3 1!= num4))
            {
                System.out.println("All numbers are different");
            }
            else
            {
                System.out.println("Neither all are equal nor different");
            }
            System.out.println("Enter another number: ");
        }
    }
}