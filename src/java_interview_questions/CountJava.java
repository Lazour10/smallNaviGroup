package java_interview_questions;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int count = 0;

        while (word.contains("java")){
            count++;
          word=  word.replaceFirst("java","");

        }
        System.out.println(count);

    }
}