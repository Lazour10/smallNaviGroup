package JavaInterviewQuestions;

public class Unique_Elements {
    public static void main(String[] args) {


        String[] names = {"Anna", "Poseidon", "Carsi", "Zeus", "Besiktas", "Turan", "Turan", "Turan", "Turan", "Besiktas", "Besiktas", "Poseidon", "Poseidon"};

        for (String each: names) {
            int count = 0;
            for (String element : names) {
                if (element.equals(each)){// stands for every element in String

                    count++;

        }


            }
            if (count==1){
                System.out.println(each);


            }

        }


    }
}
