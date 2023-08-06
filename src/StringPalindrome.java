import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args)
    {   System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String copy=str;
        String output ="";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            output += ch;
        }
        System.out.println("Reverse of the string is  :  " +output);
        if(output.equals(copy)) {
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given String is Not palindrome");
        }
    }
}



