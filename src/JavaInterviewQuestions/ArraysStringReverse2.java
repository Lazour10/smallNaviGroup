package JavaInterviewQuestions;

import java.util.Arrays;

public class ArraysStringReverse2 {
    public static void main(String[] args) {


            String[] arr = {"java", "python", "c#" };
            String[] arr1=new String[arr.length];

            for (int i = 0; i < arr.length; i++) {
                String name = arr[i];
                String reverseName = "";

                for (int j = name.length()-1; j >= 0; j--) {
                    reverseName += name.charAt(j);
                }

                arr1[arr.length-1-i]=reverseName;


            }
        System.out.println(Arrays.toString(arr1));
        }
    }



