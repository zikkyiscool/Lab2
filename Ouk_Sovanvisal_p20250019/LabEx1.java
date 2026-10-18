package test;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
        } else {
            int n = input.nextInt();
            if (n > 1000) {
                System.out.println("Number must be 1000 or less.");
            } else {
                int sum = 0;
                double average;

                System.out.println("Output:");
                for (int k = 1000; k >= n; k--) {
                    System.out.print(k + " ");
                    sum += k;
                }
                average = (double) sum / (1000 - n + 1);
                System.out.println();
                System.out.println("Sum is: " + sum);
                System.out.println("Average is: " + average);
            }
        }
        input.close();
    }
}


