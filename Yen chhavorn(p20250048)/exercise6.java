package javaproject;
import java.util.Scanner;
public class exercise6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int M,E,Ph,Pro;
		System.out.println("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
		   M= input.nextInt();
		   E= input.nextInt();
		   Ph= input.nextInt();
		   Pro= input.nextInt();
	int max=M;
	int min=M;
	String max_subject="Math";
	String min_subject="Math";
	if(E>max) {E=max; max_subject="Enlish";}
	if(Ph>max) {Ph=max; max_subject="Physics";}
	if(Pro>max) {Pro=max;max_subject="Programing";}
	
	if(E<min) {E=min; min_subject="Enllish";}
	if(Ph<min) {Ph=min;min_subject="Physics";}
	if(Pro<min) {Pro=min;min_subject="Prigraming";}
		   
	double average=(M+E+Ph+Pro)/4;
	
	System.out.println("Max score is "+max+"( "+max_subject+" )");
	System.out.println("Min score is "+min+"( "+min_subject+" )");
		
	input.close();	
 }
}
