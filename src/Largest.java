import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[4];
        System.out.println("Enter the  numbers");
         for(int j=0;j<4;j++){
            a[j] = input.nextInt();

         }
        int l= a[0];
        for(int j=1;j<4;j++){
            if(a[j]>l){
                l=a[j];
            }
        }
        System.out.println("largest is - "+l);
    }
}
