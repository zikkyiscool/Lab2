package javaproject;
import java.util.Scanner;
public class exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d,m,y;
		System.out.println("Input date: ");
		 d = input.nextInt();
		 m = input.nextInt();
		 y = input.nextInt();
 if(m<1 || m>12) 
    {
		System.out.println("Invalid.");//month must be between 1-12
	}
 else 
	{
	  int days = 31;
	  
     if(m==4||m==6||m==9||m==11) { days =30; }
     else if(m==2) 
	      {
	       days  = 28;
	       if(y % 4==0) { days=29; }
	      }
     if(d>=1 && d <= days)
        {System.out.println("Valid");}
     else 
        {System.out.println("Invalid.");}
	 }   
	input.close();	
 }		
}
