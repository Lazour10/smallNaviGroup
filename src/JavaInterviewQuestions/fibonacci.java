package JavaInterviewQuestions;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Number");

        int num= scan.nextInt();

        int a=0;
        int b=1;
        int result=0;

        for (int i = 0; i <num ; i++) {

           result=a+b;
            System.out.println(result+" ");
            a=b;
            b=result;






        }

    }
}