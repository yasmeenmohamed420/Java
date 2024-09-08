import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int count=1;
        System.out.println("Enter name : ");
        Scanner sacne = new Scanner(System.in);
        String name = sacne.next();
        char[] chars = name.toCharArray();

        for(int i=0 ; i<name.length();i++)
        {
            for(int j=i+1; j<name.length();j++)
            {
                if(chars[i]==chars[j])
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}