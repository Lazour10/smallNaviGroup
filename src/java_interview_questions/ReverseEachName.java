package java_interview_questions;

public class ReverseEachName {
    public static void main(String[] args) {



        String[] arr1={"Turan","Besiktas","Poseidon"};


        for (int i = 0; i < arr1.length; i++) {

            String result="";

            for (int j = arr1[i].length(); j >0 ; j--) {

                result+=arr1[i].charAt(j-1);

            }
            System.out.print(result+" ");

        }
        }

    }

