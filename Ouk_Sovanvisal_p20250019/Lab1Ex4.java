package test;
import java.util.Scanner;
public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String date = sc.next();

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            maxDay = 28;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                maxDay = 29;
            }
        }

        if (month >= 1 && month <= 12 && day >= 1 && day <= maxDay) {
            System.out.println("Output: valid");
        } else {
            System.out.println("Output: invalid");
        }
    }
}