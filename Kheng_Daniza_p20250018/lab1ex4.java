package test;

import java.util.Scanner;

class CheckDate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        int month;
        int date;
        System.out.println("Input Year: ");
        year = sc.nextInt();
        System.out.println("Input Month: ");
        month = sc.nextInt();
        System.out.println("Input Day: ");
        date = sc.nextInt();
        System.out.println("Your input date: " + year + "-" + month + "-" + date);
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if(date<1 || date>31){System.out.println("Invalid Date");}
                    else{System.out.println("Valid Date");}
                    break;
                case 2:
                    if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                        if(date<1 || date>29){System.out.println("Invalid Date");
                        }else{System.out.println("Valid Date");}}
                    else{
                        if(date<1 || date>28){System.out.println("Invalid Date");
                        }else{System.out.println("Valid Date");}}
                    break;
                case 4, 6, 9, 11:
                    if(date<1 || date>30){System.out.println("Invalid Date");}
                    else{System.out.println("Valid Date");}
                    break;
                default:
                System.out.println("Invalid Date");
                break;
            }
        }
}
