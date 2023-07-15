import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        int f = 0;
        int s = 1;
        int g;
        while (s<numb){
            g = f;
            f = s;
            s = g+ s;
        }
        if (s == numb) {
            System.out.println("Given number is fibonacci");
            }
        else {
            System.out.println("Given number is not fibonacci");

        }


    }
}