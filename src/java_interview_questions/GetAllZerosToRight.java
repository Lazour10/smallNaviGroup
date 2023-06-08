package java_interview_questions;

public class GetAllZerosToRight {
    public static void main(String[] args) {


        //Without using sort array
        int[] arr = {5, 9, 6, 0, 0, 0, 5, 4, 8};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }



            }
        }
        for (int i = arr.length-1,j=0; i >=0; j++,i--) {
            int result =arr[i];
            System.out.print(result+" ");
        }



    }

}

