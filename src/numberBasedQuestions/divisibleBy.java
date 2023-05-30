package numberBasedQuestions;
/*
 write a program that can print numbers between 1-100 that can be divisible by 3,5,15
 - if the number can be divisible by 3,5, 15, it should only be displayed in the  DivisibleBy15 section
 - if the number can be divisible by 3 and not 15 it should only be displayed in the DivisibleBy3 section
 -divisible by 5 but not 15 it should only be displayed in the DivisibleBy5 section
  */

public class divisibleBy {
    public static void main(String[] args) {
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";  // will store result

        for (int i = 1; i <=100 ; i++) {
            if(i%15==0 &&i%5==0 &&i%3==0){
              divisibleBy15 +=" " + i;
            } else if(i%3==0 && i%15!=0 && i%5!=0 ){
                divisibleBy3 +=" " + i;

            } else if (i%3!=0 && i%15!=0 && i%5==0){
                divisibleBy5 += " "+ i;
            } else {
                continue;
            }

        }
        System.out.println("divisible by 15: " + divisibleBy15);
        System.out.println("divisible by 3: " + divisibleBy3);
        System.out.println("divisible by 5: " + divisibleBy5);





    }
}
