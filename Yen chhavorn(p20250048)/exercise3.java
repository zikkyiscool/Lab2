package javaproject;
import java.util.Scanner;
public class exercise3 {
	
	  int a,b,c,d,e;
	System.out.print("  INPUT 5 numbers:\n");
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();
       d = input.nextInt();
       e = input.nextInt();
      int max =a; // set as a is max
      int min =a; // set as a is min
      if (b > max) max = b;
      if (c > max) max = c;
      if (d > max) max = d;
      if (e > max) max = e;

      if (b < min) min = b;
      if (c < min) min = c;
      if (d < min) min = d;
      if (e < min) min = e;   
   System.out.println("Among all the five input numbers ( "+a+" "+b+" "+c+" "+d+" "+e+" ),");
   System.out.println("minimum is "+min+" maximum is "+max+ ".");
 input.close();
 }
}