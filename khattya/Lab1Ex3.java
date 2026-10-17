package test;

import java.util.Scanner;

class CompareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = a ;
        g = a;
        if(b>f){f=b;}
        if(c>f){f=c;}
        if(d>f){f=d;}
        if(e>f){f=e;}
        if(b<g){g=b;}
        if(c<g){g=c;}
        if(d<g){g=d;}
        if(e<g){g=e;}
            System.out.println("The largest number is " + f);
            System.out.println("The smallest number is " + g);
    }
}

