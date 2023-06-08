package java_interview_questions;

import java.util.Scanner;

public class RemoveDublicate {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word= scan.nextLine();



String result="";

        for (int i = 0; i < word.length(); i++) {


            char red=word.charAt(i);

            if (!result.contains(""+red)){
                result+=red;
            }

        }
        System.out.println(result);
    }
}
/*
XExamples:

uniqueChars("java") ==> "jav"
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
[11:22 PM]
char red=sentence.charAt(i);
 */