import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int copy1 = num;
        int copy2 = num;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        while (copy1 != 0) {
            int p = copy1 % 10;
            sum = sum + (int) Math.pow(p, count);
            copy1/= 10;
        }
        if (sum == copy2) {
            System.out.println("Armstrong ");
        } else {
            System.out.println("Not Armstrong ");
        }
    }


}

