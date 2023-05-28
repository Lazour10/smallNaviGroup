package StringQuestions;

public class reverseString {

        public static void main(String[] args) {
            String sg="Anna";
            String reverse=reverseString(sg);
            boolean Palindrome= isPalindrome(sg, reverse);
            System.out.println("original String: " + sg + "..... reverse string: " + reverse);
            System.out.println(Palindrome);
        }




        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));// charAt= Strings
            }

            return reversed.toString();
        }

        public static boolean isPalindrome(String original, String reverse){
            return original.equalsIgnoreCase (reverse);
        }
    }






