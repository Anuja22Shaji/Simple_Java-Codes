import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        System.out.println("Enter the size of Queue ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int front=0;
        int rear=0;
        do {
            System.out.println("...Choose an Option...");
            System.out.println("1--To Display the  elements");
            System.out.println("2--To Insert an elements in Q");
            System.out.println("3--To Delete an element from the Q");
            System.out.println("4--Exit");
            int c = input.nextInt();
            switch (c) {
                case 1:
                    System.out.println("the  items in the Q are");
                    for (front = 0; front < rear; front++) {
                        System.out.println(a[front]);
                    }
                    break;
                case 2:
                    if (rear == n) {
                        System.out.println("Q is already full");

                    } else {
                        System.out.println("enter the elements");
                        int item = input.nextInt();
                        a[rear] = item;
                        rear++;

                    }
                    break;
                case 3:
                    if(rear!=0)
                    {
                        System.out.println("One item is deleted");
                        System.out.println("the remaining elements in the Q are");
                        rear--;
                        for (front = 0; front < rear; front++) {
                            a[front] = a[front + 1];
                            System.out.println(a[front]);
                        }

                    }
                    else {
                        System.out.println("Q is already Empty");
                    }
                    break;
                case 4:
                    return;

            }
        }
        while (true);


    }
}