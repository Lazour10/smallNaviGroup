package Week3_Raphael_Questions;

public class FrequencyOfCharacters {

    public static String findFrequencyOfChars(String input) {

            int[] frequency = new int[128]; // Array to store frequency of characters

            // Calculate the frequency of each character in the input string
            for (char c : input.toCharArray()) {
                frequency[c]++;
            }

            // Create a StringBuilder to construct the result string
            //StringBuilder result = new StringBuilder();
            String result ="";

            // Iterate through the frequency array and append character and frequency to the result
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    //result.append((char) i).append(frequency[i]);
                    result += (char) i + "" + frequency[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String result = findFrequencyOfChars(input);
            System.out.println(result);  // Output: A3B2C1D2
        }
    }
}
