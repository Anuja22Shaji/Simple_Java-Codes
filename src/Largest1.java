import java.util.Scanner;

public class Largest1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int largest =n1;
        if(n2>largest)
        {
            largest=n2;

        }
        if(n3>largest)
        {
            largest=n3;

        }if(n4>largest)
    {
        largest=n4;

    }

        System.out.println("largest is - "+largest);
    }
}
