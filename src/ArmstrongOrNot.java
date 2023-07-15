import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int e = input.nextInt();
        int n = e;
        int u = e;
        int s = 0;
        int c = 0;

        while (e != 0) {
            e /= 10;
            c++;
        }
        while (n != 0) {
            int p = n % 10;
            s = s + (int) Math.pow(p, c);
            n /= 10;
        }
        if (s == u) {
            System.out.println("Armstrong ");
        } else {
            System.out.println("Not Armstrong ");
        }
    }


}

