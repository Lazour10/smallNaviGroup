package java_interview_questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


            for (int i = 0; i <15; i++) {
                if (isPrime(i)){
                    System.out.println(i+" ");
                }
            }
        }


        public static boolean isPrime(int number){
            if (number < 2){
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    return false;
                }


            }
            return  true;
        }


    }





