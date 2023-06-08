package JavaInterviewQuestions;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 76, 31, 43, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int secondmax=arr[arr.length-2];
        int max=arr[arr.length-1];
        int min= arr[0];
        System.out.println(max);
        System.out.println(min);

    }
}

