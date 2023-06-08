package JavaInterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int r, sum = 0, temp;
        temp = num;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("not Palindrome number");

            //13431
        }
    }
}
