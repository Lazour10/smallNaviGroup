package FirstPractice;

/*
this method accepts an Array and returns the sum of all the elements in the array
 */

    public class SumArray {

        public static void main(String[] args) {

            int[] abc = {1,2,3,4,5,6};

            int ab = Sum(abc);

            System.out.println(ab);
        }

        public static int Sum(int[] a){
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i]; //increment
            }
            return result;
        }
    }

