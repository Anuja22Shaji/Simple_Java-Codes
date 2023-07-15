import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int r = 0;

            while (num!= 0)
            {
                int p = num % 10;
                r = r * 10 + p;
                num /= 10;
            }


        System.out.println("Reverse = " +r);
    }

}
