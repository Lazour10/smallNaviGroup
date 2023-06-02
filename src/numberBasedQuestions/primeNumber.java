package numberBasedQuestions;

//This is a method that can check if a number is prime or not

/* Logic
-check to see if the number is greater than 2
-write a method
- check remainder to ensure it is prime
-if remainder >1 = composite
-if divided by 2 is >1 then it is not prime
- NOTE: 0, 1 - not considered prime

find prime - square root

 */

public class primeNumber {
    public static boolean isPrime(int number){
        if(number < 2){
          return false;// pre-condition

        }
        // check divisibility of number
       for (int i = 2; i <= number ; i++) {
           if( number%i==0){
               return false;
            }


        }
        return true;


    }

    public static void main(String[] args) {
        int number = 7;
       if (isPrime(number)) {
           System.out.println(number + " is a prime number");
       } else {
           System.out.println(number + " is not a prime number");
       }







    }



}
