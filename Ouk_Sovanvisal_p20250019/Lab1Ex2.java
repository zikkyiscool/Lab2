package test;
import java.util.Scanner;
public class abc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a,b,c;
System.out.println("Enter a: " );
a = sc.nextDouble();
System.out.println("Enter b: " );
b = sc.nextDouble();
System.out.println("Enter c: " );
c = sc.nextDouble();
double formula = b*b - 4*a*c;
double x_1 = (-b + Math.sqrt(formula))/(2*a);
double x_2 = (-b - Math.sqrt(formula))/(2*a);
if (formula > 0) {
System.out.println("The square roots are: ");
System.out.println("x1 = " + x_1);
System.out.println("x2 = " + x_2); }
if (formula < 0) {
System.out.println("The root is imaginary");
}
if (formula == 0 ) {
System.out.println("The roots are: " + (x_1 == x_2)); }
sc.close();
}
}

