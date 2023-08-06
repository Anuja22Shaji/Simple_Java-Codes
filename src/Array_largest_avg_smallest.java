import java.util.Scanner;

public class Array_largest_avg_smallest {
    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int evn_count = 0;
        System.out.println("Enter the  integers");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
            if (a[i] % 2 == 0) {
                evn_count++;
            }
        }
        int lar = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > lar) {
                lar = a[i];
            }
        }

        int smal = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < smal) {
                smal = a[i + 1];
            }
        }

        System.out.println("Largest  is - " + lar);
        System.out.println("Smallest is - " + smal);
        System.out.println("Total sum is -  " + sum);
        int avg = sum / n;
        System.out.println("Average is -  " + avg);
        System.out.println("count of even numbers is - " + evn_count);
    }
}