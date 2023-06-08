package java_interview_questions;

import java.util.Arrays;

public class ArrayStringReverse {

    public static void main(String[] args) {
        String[] arr = {"java", "python", "c#"};

        String[] result=new String[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; j++,i--) {
            result[j]=arr[i];


        }
        System.out.println(Arrays.toString(result));

        }

    }

