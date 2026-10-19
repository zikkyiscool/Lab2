package test;

import java.util.Scanner;
class FindRoots {
    public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;
        double X1=0;
        double X2=0;
        double delta=0;
        System.out.println("Input a:");
        a=sc.nextInt();
        if(a==0){
            System.out.println("a can not be 0");
        }
        else {
            System.out.println("Input b:");
            b = sc.nextInt();
            System.out.println("Input c:");
            c = sc.nextInt();
            System.out.println("The equation is " + a + "x² +" + b + "x " + c + " = 0");
            delta = ((b * b) - (4 * a * c));
            if (delta > 0)
            {
                X1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                X2 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                System.out.println("The first root is " + X1);
                System.out.println("The second root is " + X2);
            }
        else if(delta == 0){
                X1 = (-(b) / 2 * a);
                System.out.println("x=" + X1);
            } else {
                System.out.println("There is no root");
            }
        }
    }
}


