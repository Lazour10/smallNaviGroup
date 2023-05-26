package arrayQuestions;

// swap two variables using a temp variable

public class swapNumbers {
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        int tempNum;

        //re-assigning num1

        tempNum=num1; // =5
        num1=num2;
        num2=tempNum;


        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);

        System.out.println(" swap two variables without  using a temp variable...60%..");

        int a=7;
        int b=8;

        b=b * a;

         // b=56
        a=b/a;

        System.out.println("a= " + a); // a=8

        b=b/a;
        System.out.println("b= " +b);

        System.out.println("....................................");
       int a1=7;
       int b1=8;

       a1=a1+b1;
        b1=a1-b1;

        System.out.println("b1= " + b1);
        a1=a1-b1;
        System.out.println("a1= " + a1);











    }
}
//logic
/* 1. re-assign one variable to the temp variable
2.

 */