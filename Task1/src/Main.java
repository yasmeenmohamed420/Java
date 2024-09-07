import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String[]weekDay ={"Saturday", "Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Please enter number from 0 to 6");

        while(true)
        {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            for (int i = 0 ; i<weekDay.length ;i++)
            {
                if (number >= 0 && number <= 6)
                {
                    System.out.println(weekDay[number]);
                    break;
                }
                else
                {
                    System.out.println("Out of range, Enter anther number between 0 to 6");
                    break;
                }
            }

            System.out.println("Enter another number: ");
        }
    }
}