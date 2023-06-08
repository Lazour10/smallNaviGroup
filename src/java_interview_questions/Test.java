package java_interview_questions;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String[] arr1={"JAVA   ","SELENIUM","PAYTHON"};
        String[] arr2={"SQL","A","   API"};

        String[] result=new String[arr1.length+arr2.length];

        int i=0;
        for (String s : arr1) {
            if(s.length()==1){
                result[i++]=s;
            }else{
                s=s.trim();
                s=""+s.charAt(0)+s.charAt(s.length()-1);
                result[i++]=s;
            }
        }

        for (String s : arr2) {
            if(s.length()==1){
                result[i++]=s;
            }else{
                s=s.trim();
                s=""+s.charAt(0)+s.charAt(s.length()-1);
                result[i++]=s;
            }
        }

        System.out.println(Arrays.asList(result));







        }

}
