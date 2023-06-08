package JavaInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        //Scanner scan=new Scanner(System.in);

       // String word=scan.nextLine();

        String str="abcd";

        String str1="cdba";

      //  String word1= scan.nextLine();
        // write a program that can check if str1 and str2 are build out same characters


       char[]  ch1=str.toCharArray();
       char[]  ch2=str1.toCharArray();

      Arrays.sort(ch1);
      Arrays.sort(ch2);


      boolean isAnagram=Arrays.equals(ch1,ch2);

        System.out.println(isAnagram);


      }

    }

