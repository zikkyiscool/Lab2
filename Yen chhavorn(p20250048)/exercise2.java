package javaproject;
import java.util.Scanner;
public class exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      System.out.print("************************************\n");
	      System.out.print("       Welcome to our program   \n");	
	      System.out.println("Quadratic Equation solver ax2+bx+c=0 ");
	      System.out.print("************************************\n\n");
	  int a,b,c;
	      System.out.print("input a: ");  
		a = input.nextInt();
	      System.out.print("input b: ");  
		b = input.nextInt();
	      System.out.print("input c: ");  
		c = input.nextInt();
	   double d=b*b-4*a*c;
	if(d>0) {
		 double r1 = (-b+Math.sqrt(d)/(2*a));
		  double r2 = (-b-Math.sqrt(d)/(2*a));
	      System.out.print("************************************\n");
	      System.out.print("   Roots of this equation: "+a+"x2 "+"+" +b+"x+ " +c+ "= 0\n" );
	      System.out.println("      X1= " + r1);
	      System.out.println("      X2= " + r2);
	      System.out.print("************************************\n");
	}
	else if(d==0) {
		  double r = -b/2*a;
	      System.out.print("************************************\n");
	      System.out.print("   Root of this equation: "+a+"x2"+"+" +b+"x+ " +c+ "= 0\n" );
	      System.out.println("      X1=X2= "+r);
	      System.out.print("************************************\n");
	  }
	  
	else{
		  System.out.print("there is no Root of this equation: "+a+"x2"+"+" +b+"x+ " +c+ "= 0\n" );
	  }
	 input.close();
   }
 }
