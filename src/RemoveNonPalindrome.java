
import java.util.Scanner;

public class RemoveNonPalindrome {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of string");
        int n = input.nextInt();
        input.nextLine();
        int k=0;
        String[] arrayOfPalindromeStrings = new String[n];
        String[] arrayOfStrings = new String[n];
        System.out.print("Enter strings : ");
        for (int i = 0; i<n; i++) {
            arrayOfStrings[i] = input.nextLine();
        }
        for (int j = 0; j < n; j++) {
            String str=arrayOfStrings[j];
            String copy = str;
            String output = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                output += ch;
            }
            if (output.equals(copy)) {
                arrayOfPalindromeStrings[k]=copy;
                k++;

            }
        }
        System.out.println("Palindrome strings:");
        for (int i = 0; i < k; i++) {
            System.out.println(arrayOfPalindromeStrings[i]);
        }
    }
}


