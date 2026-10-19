package test;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input number: ");
        n = sc.nextInt();
        System.out.print("Prime number between 2 and " + n + " : ");
        if (n < 2) {
            System.out.println("There is none.");}
        if(n>=2) {
            for (int i = 2; i < n; i++) {
                int k = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        k++;
                    }
                }
                if (k == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}















