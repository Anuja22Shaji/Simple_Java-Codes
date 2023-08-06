import java.util.Scanner;

public class SumEuqalsGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the  size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array_of_nos = new int[n];
        System.out.println("Enter the  nos in the array");
        for (int j = 0; j < n; j++) {
            array_of_nos[j] = input.nextInt();
        }
        System.out.println("Enter the given number");
        int nn = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((array_of_nos[i] + array_of_nos[j]) == nn)
                {
                    System.out.println(array_of_nos[i] + "+" + array_of_nos[j] + "=" + nn);

                }
            }
        }
    }

}
