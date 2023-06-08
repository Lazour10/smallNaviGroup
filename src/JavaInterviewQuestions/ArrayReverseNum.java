package JavaInterviewQuestions;

import java.util.Arrays;

public class ArrayReverseNum {
    public static void main(String[] args) {

     int[]   array = {1,2,3,4,5,6};
     int[] result=new int[array.length];
       int j=0;
        for (int i = array.length - 1; i >= 0; i--) {

                result[j++]=array[i];

            }

        System.out.println(Arrays.toString(result));



        for (int i = 0; i < array.length/2 ; i++) {
            int result1 =array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=result1;

        }
        System.out.println(Arrays.toString(array));
        }

    }




/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
 */
