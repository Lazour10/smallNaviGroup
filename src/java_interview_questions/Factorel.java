package java_interview_questions;

import java.util.Scanner;

public class Factorel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number");

       int num1=scan.nextInt();
       long fac=1;

        for (int i = 1; i <=num1 ; i++) {

            fac*=i;

        }
        System.out.println(fac);
    }
}
