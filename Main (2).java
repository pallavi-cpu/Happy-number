import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] a = new int[size];
       
        int mul = 1;

        System.out.println("Enter " + size + " int ele:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
            mul = mul * a[i];
        }

       
        for (int i = 0; i < size; i++) {
            if (a[i] != 0) { 
                a[i] = mul / a[i];
                System.out.println("o/p: " + a[i]);
            } else {
                System.out.println("o/p: " + i + ". ");
            }
        }

        scanner.close();
    }
}