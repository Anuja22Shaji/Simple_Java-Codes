import java.util.Scanner;

public class Sort {
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

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Descending order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
