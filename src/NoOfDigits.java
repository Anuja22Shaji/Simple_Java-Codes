import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        if (num == 0)
        {
            count = 1;
        }
        else {
            while (num!= 0)
            {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits= " + count);
    }
}