package numberBasedQuestions;

/*
2) Number - Reverse negative number
This is a return method that can reverse negative number and return it as int
// logic
- if positive we do not reverse
-if number is negative we reverse but it stays negative
-negative number reverse e.g -3456 reverse= -6543
- 3456/10 = 345 remainder 6
return remainder as 1 number = 6
345/10 = 34.5 remainder 5 === return 5


 */

public class reverseNegativeNumber {

    public static int reverseNegativeNum(int number) {

       // if (number > 0) {
          //  return number; // if it is positive return number
       // }

        if (number <0) {
            String numberString= Integer.toString(number); // convert to string so we can use string builder to reverse
            String reversedString= new StringBuilder(numberString.substring(1))//because index 0 is negative sign
                    .reverse().toString();
            int reverseNumber= Integer.parseInt(reversedString);// converting it back to integer
            return -reverseNumber;
        }
        return number;

        }

    public static void main(String[] args) {

        System.out.println(reverseNegativeNum(-123));

    }


    }







