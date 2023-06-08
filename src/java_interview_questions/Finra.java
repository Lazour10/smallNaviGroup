package java_interview_questions;

public class Finra {
    public static void main(String[] args) {



        for (int i = 1; i < 100; i++) {

         int each=0;
         each+=i;


            if (each%15==0){
                System.out.println("FINRA");
            }else if (each%5==0){
                System.out.println("FIN");
            }else if(each%3==0){
                System.out.println("RA");
            }else{
                System.out.println(each);
            }

        }
    }
}
