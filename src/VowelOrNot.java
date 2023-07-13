
import javax.swing.*;
import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args)
    {
        System.out.println("Enter the Alphabet");
        Scanner input= new Scanner(System.in);
        char alp =input.next().charAt(0);
        char l=Character.toLowerCase(alp);
        if (l == 'a'|| l == 'e'|| l == 'i'|| l == 'o'|| l == 'u') {
            System.out.println("The given input is a Vowel");
            ;
        }

        else
        {
            System.out.println("The given input is not a Vowel ");
        }
    }
}
