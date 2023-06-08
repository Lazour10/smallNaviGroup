package java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCombineTwoString {


    public static void main(String[] args) {

      String[]  arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> listOne=new ArrayList<>(Arrays.asList(arr1));
       listOne.addAll(Arrays.asList(arr2));



        System.out.println(listOne);


        System.out.println("---------------------------------");

        //Ask about combining two Integer Array numbers

//find max and min numbers
        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(15);
        list1.add(545);
        list1.add(232);
        list1.add(12321);

      int max= Collections.max(list1);

        System.out.println(max);

        int min=Collections.min(list1);

      System.out.println(min);






















    }
}
