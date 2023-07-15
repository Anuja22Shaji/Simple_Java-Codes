import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number:");
        Scanner input = new Scanner(System.in);
        int d= input.nextInt();

        String b = "";

        while (d > 0) {
            int r= d % 2;
            b = r + b;
            d = d / 2;
        }

        System.out.println("Binary representation: " + b);
    }
}
