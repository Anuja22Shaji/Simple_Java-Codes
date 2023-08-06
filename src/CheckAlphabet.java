import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();


        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                System.out.println("Contains non-alphabetic characters");
                return;

            }
        }
        System.out.println("Contains only alphabetic characters");

    }
}
