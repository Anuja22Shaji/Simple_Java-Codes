import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();
        int a = num1;
        int b = num2;
        int h=0;

        while (b != 0) {
            h = b;
            b = a % b;
            a = h;
        }
        System.out.println("hCF= " + h);
        int l = (num1 * num2)/h;
        System.out.println("LCM= " + l);


    }

}
