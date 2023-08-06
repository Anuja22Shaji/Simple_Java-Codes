import java.util.Scanner;
public class CheckWetheraNumberIsPresrentOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the  size of the array");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] array_of_nos= new int[n];
        System.out.println("Enter the  nos in the array");
        for(int j=0;j<n;j++){
            array_of_nos[j] = input.nextInt();
        }
        System.out.println("Enter the  no to check whether the number is present or not ");
        int nn = input.nextInt();
        int l= nn;
        for(int j=0;j<n;j++){
            if(array_of_nos[j]==l){
                System.out.println("The number is present ");
                System.out.println("The location of the number is "+(j+1));


            }
        }
    }
}
