package Practice2;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int x = 30;
        int y = 20;

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

    }
}


