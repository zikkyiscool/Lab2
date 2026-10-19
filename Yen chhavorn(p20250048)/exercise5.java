package javaproject;
import java.util.Scanner;
public class exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  System.out.print("input n: ");
	 int n = input.nextInt();
     System.out.println("Prime numbers from 2 to " + n + ":");//find prime(i) by loop under

     for (int i = 2; i <= n; i++) 
       {
         boolean Prime = true;//store false or true
         for (int k = 2; k <= Math.sqrt(i); k++) //prime is divisor only 1 and itself
         {
           if (i % k == 0) 
             {
              Prime = false;
              break;//stop loop
             }
         }

         if (Prime) {
             System.out.print(i + " ");//display number i(prime) to above
         }
       }	
	input.close();	
	}
}
