package test;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int min = a;
        int max = a;
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        if (d < min) {
            min = d;
        }
        if (d > max) {
            max = d;
        }
        if (e < min) {
            min = e;
        }
        if (e > max) {
            max = e;
        }
        System.out.println("Among all the five input numbers (" + a + ", " + b + ", " + c + ", "
                + d + " and " + e + "), min is " + min + " and max is " + max + ".");
        input.close();
    }
}
