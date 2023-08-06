import java.util.Scanner;

public class MaxMinAvg1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0;
        int num;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the "+i+ " th number ");
            num =input.nextInt();
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum is - "+max);

        System.out.println("Minimum is - "+min);
        System.out.println("Total sum is -  "+sum);
        float avg=sum/n;
        System.out.println("Average is -  "+avg);
    }

}
