import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner input = new Scanner(System.in);
        int year= input.nextInt();
        if ((year % 4) == 0)
        {
            if ((year % 100) == 0)
            {
                if ((year % 400) == 0)
                {
                    System.out.println("Input is leap year");
                }
                else
                {
                    System.out.println("The entered year is not a leap year");
                }

            }
            else
            {
                System.out.println("Input is leap year");
            }
        }
        else
        {
            System.out.println("The entered year is not leap year");
        }

    }


}
