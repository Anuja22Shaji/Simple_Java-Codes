import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the  size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] temp = new int[n];
        System.out.println("Enter the  nos in the array");
        for (int j = 0; j < n; j++) {
            a[j] = input.nextInt();
        }
        int k=0;

            for (int j =0 ; j < n -1; j++) {
                if (a[j] != a[j+1]) {
                    temp[k++]= a[j];
                   // k++;
                }

            }
            System.out.println("New Array is");
            for (int j = 0; j < k; j++) {
                System.out.println(temp[j]);
            }

    }
}
