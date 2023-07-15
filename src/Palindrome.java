import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        int copy = numb;
        int r = 0;

        while (numb != 0) {
            int p = numb % 10;
            r = r * 10 + p;
            numb /= 10;
        }
        if (r == copy) {

            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}