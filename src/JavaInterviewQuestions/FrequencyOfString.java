package JavaInterviewQuestions;

public class FrequencyOfString {
    public static void main(String[] args) {
        String arg="AAABBCDD";
        System.out.println("frequency(arg) = " + frequency(arg));

    }

    public static String frequency(String word) {
        String result = "";
        for (int i = 0; i <word.length(); i++) {
            int count = 0;
            for (int j = 0; j <word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    count++;
            }
            if (result.contains(""+word.charAt(i))) {
                continue;}

            result += word.charAt(i) + "" + count + "";
        }
        return result;
    }

}



