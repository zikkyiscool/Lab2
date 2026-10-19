package test;

import java.util.Scanner;

class InputScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int math;
        int english;
        int physic;
        int program;
        double avg;
        System.out.println("Input your score(Math; English; Physic and Programing): ");
        math = sc.nextInt();
        english = sc.nextInt();
        physic = sc.nextInt();
        program = sc.nextInt();
        avg = (math + physic + english + program)/4;
        int[] numbers = {math,english,physic,program};
        String[] subjects = {"Math", "English", "Physic", "Programming"};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Highest score: " + max);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                System.out.print("("+ subjects[i]+ ") ");
            }
        }
        System.out.println();
        System.out.print("Lowest score: " + min);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                System.out.print("("+ subjects[i]+ ") ");
            }}
        System.out.println("");
        System.out.println("The average score is: " + avg);
    }
}
