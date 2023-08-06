import java.util.Scanner;

public class QueueAndStackImplementation {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array_of_nos = new int[n];
        System.out.println("Enter the  nos");
        for (int j = 0; j < n; j++) {
            array_of_nos[j] = input.nextInt();
        }
        System.out.println("Queue Implementation is\n");
        for (int j = 0; j < n; j++) {
            System.out.println(array_of_nos[j]+"\n");

        }
        System.out.println("Stack Implementation is\n");
        for (int k = n-1; k >= 0; k--) {
            System.out.println(array_of_nos[k]+"\n");

        }

    }
}
