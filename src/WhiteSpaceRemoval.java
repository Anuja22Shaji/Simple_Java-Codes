import java.util.Scanner;

public class WhiteSpaceRemoval {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String with white space");
        String str = input.nextLine();
        String output ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                output += ch;
            }
        }
        System.out.println("The white space removed String is  "+output);
    }
}

