package java_interview_questions;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();


        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.println(word.charAt(i));
            }

        }
    }
}
