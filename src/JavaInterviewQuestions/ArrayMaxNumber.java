package JavaInterviewQuestions;

import java.util.Arrays;

public class ArrayMaxNumber {
    public static void main(String[] args) {


        int[] arr = {5, 11, 6, 1, 30, 25, 11, 67};

        int max = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];


            }


        }

        System.out.println(max);


        int[] number = {1, 3, 4, 5, 7, 9};

        Arrays.sort(number);

        System.out.println(number.length - 1);

        System.out.println(number.length - 2);

    }

}