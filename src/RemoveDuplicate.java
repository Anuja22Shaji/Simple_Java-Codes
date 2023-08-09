import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the  size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the  nos in the array");
        for (int j = 0;j < n;j++) {
            a[j] = input.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < n; i++) {
                if (a[j] == a[i]) {

                    for (int k = i; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                    i--;
                }
            }
        }
            System.out.println("New Array is");
            for (int j = 0; j < n; j++) {
                System.out.println(a[j]);
            }

    }
}
