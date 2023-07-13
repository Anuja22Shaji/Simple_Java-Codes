import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
    System.out.println("Enter the value of n");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    int s=0;
    System.out.println("Enter the  numbers");
    for(int i=0;i<n;i++){
        a[i] = input.nextInt();
        s += a[i];
    }
    int max=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    System.out.println("Maximum is - "+max);
    int min=a[0];
    for(int i=1;i<n;i++){
        if(a[i]<min){
            min=a[i+1];
        }
    }
    System.out.println("Maximum is - "+min);
    System.out.println("Total sum is -  "+s);
    int avg=s/n;
    System.out.println("Average is -  "+avg);
}

}
