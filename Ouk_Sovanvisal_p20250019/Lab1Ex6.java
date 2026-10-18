package test;
import java.util.Scanner;
public class Score {
    static String getCourses(int target, int math, int english, int physics, int programming) {
        String result = "";
        if (math == target) {
            result = "Math";
        }
        if (english == target) {
            if (!result.equals("")) {
                result += " and ";
            }
            result += "English";
        }
        if (physics == target) {
            if (!result.equals("")) {
                result += " and ";
            }
            result += "Physics";
        }
        if (programming == target) {
            if (!result.equals("")) {
                result += " and ";
            }
            result += "Programming";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
        int math = sc.nextInt();
        int english = sc.nextInt();
        int physics = sc.nextInt();
        int programming = sc.nextInt();
        int max = Math.max(Math.max(math, english), Math.max(physics, programming));
        int min = Math.min(Math.min(math, english), Math.min(physics, programming));
        double average = (math + english + physics + programming) / 4.0;
        System.out.println("Max score is: " + max + " (" + getCourses(max, math, english, physics, programming) + " courses).");
        System.out.println("Min score is: " + min + " (" + getCourses(min, math, english, physics, programming) + " courses).");
        System.out.println("Average score of this student is: " + average);
    }
}