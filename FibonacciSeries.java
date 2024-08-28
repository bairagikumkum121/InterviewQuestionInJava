import java.util.Scanner;

public class FibonacciSeriesUsingRecusrion {
    public static int fibonacciSeries(int value) {
            if (value <= 1) {
                return value;
            }
            return fibonacciSeries(value - 1) + fibonacciSeries(value - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
}
