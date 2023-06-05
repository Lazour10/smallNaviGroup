package numberBasedQuestions;

public class PrimeNumber2 {

    public static void primeNumber(int num){
        for (int i = 2; i < num; i++) {

        }
        if (num %2==0 && num <2){
            System.out.println(num + " is not a prime number" );
        } else {
            System.out.println(num + " is a prime number");
        }
    }

    public static void main(String[] args) {
        primeNumber(83);

    }
}
