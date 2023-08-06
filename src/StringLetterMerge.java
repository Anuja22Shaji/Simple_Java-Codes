import java.util.Scanner;

public class StringLetterMerge {
    public static void main(String[] args) {
        System.out.println("Enter the  number of  n ");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        String[] array_of_string= new String[s];
        System.out.println("Enter the  strings");
        for(int j=0;j<s;j++){
            array_of_string[j] = input.next();
        }
        for(int j=0;j<s/2;j++){
            System.out.println(array_of_string[j] +array_of_string[s-1-j]);
        }
        if (s % 2 == 1) {
            System.out.println(array_of_string[s / 2]);
        }

    }
}
