package java_interview_questions;

import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] array={10,0,5,0,1,0};
        Arrays.sort(array);

        int[] newarr=new int[array.length];

        for (int i = array.length-1,j=0; i >=0 ;j++, i--) {
            newarr[j]=array[i];

        }

        System.out.println(Arrays.toString(newarr));
    }
}
