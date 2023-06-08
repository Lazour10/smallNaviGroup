package JavaInterviewQuestions;

import java.util.Arrays;

public class String_sameCharacters {

    public static void main(String[] args) {


        String word="abc";

        String word1="cab";



        char[] ch1=word.toCharArray();

        char[] ch2=word1.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }
}
/*
)  check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
        same("abc",  "abb"); -> false:

 */