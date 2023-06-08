package java_interview_questions;

import javax.swing.*;

public class StringReverse {


    public static void main(String[] args) {


        String name = "HaciOsmanGiltwetgsdggdg";

        String rvs = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            rvs += name.charAt(i);

        }
        System.out.println(rvs);


        String name1 = "fdgsfdsgdfgdfg";

        String rvs1 = "";

        for (int i = name1.length() - 1; i >= 0; i--) {

            rvs1 += name1.charAt(i);


        }

        System.out.println(rvs1);

    }

}
