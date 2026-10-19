package test;
import java.util.Scanner;
class inputExample {
        public void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n;
            double sum = 0;
            double average =0;
            System.out.println("Input n:");
            n=sc.nextInt();
            for(int i=1000;i>=n;i--){
                sum = sum + i;
                System.out.print(i + " ");
            }
                average= sum/(1001-n);
            System.out.println();
            System.out.println("The sum is:"+sum);
            System.out.println("The average is: "+average);

        }
    }

