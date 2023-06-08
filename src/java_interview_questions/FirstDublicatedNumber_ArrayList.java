package java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDublicatedNumber_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,3,3,4,4,5,6,7,7)); // adding multiple elements at once by using bulk operation

        int firstDuplicatedElement = 0;

        for (Integer each : list) {

            int frequency = 0;

            for (Integer element : list) {
                if(each == element){
                   frequency++;

                }
            }

            if(frequency > 1){
                firstDuplicatedElement = each;
                break;
            }

        }

        System.out.println("firstDuplicatedElement = " + firstDuplicatedElement);;


    }


}
