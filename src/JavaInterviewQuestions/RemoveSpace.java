package JavaInterviewQuestions;

public class RemoveSpace {
    public static void main(String[] args) {
        String input = "  Hello world      I      love      Java    ";

        String[] result=input.trim().split(" ");

        String res="";
        for (String each : result) {
            if (!each.isEmpty()) {
               res += each + " ";
            }


        }
        System.out.println(res.trim());




    }
}
