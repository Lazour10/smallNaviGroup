package JavaInterviewQuestions;

import java.util.ArrayList;

public class HidePassword {

    public static void main(String[] args) {

        String[] password = {"one", "hi", "hold"};

        ArrayList<String> hiddenPassword=new ArrayList<>();

        for (String each : password) {

            hiddenPassword.add(ConvertStar(each));



        }
        System.out.print(hiddenPassword);

    }











    public static String ConvertStar(String str){
        String star="";

        for (int i = 0; i < str.length(); i++) {

            star+="*";

        }

        return star;



    }
}
