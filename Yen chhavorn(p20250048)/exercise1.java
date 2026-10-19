package javaproject;
import java.util.Scanner;
public class exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float num = input.nextInt();
		float sum = 0;
		for(int x=1000; x>= num; x--) {
		sum = sum + x;	
		}
		float average = sum/(1000 - num + 1);
		System.out.println("The sum of the number is " +sum+ " and the average of the number is " +average);
	input.close();	
}
}