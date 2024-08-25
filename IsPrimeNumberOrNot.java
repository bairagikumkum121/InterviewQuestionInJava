import java.util.Scanner;

public class PrimeNumberProgram {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean value = false;
        for (int i = 2; i <= a / 2; i++) {
            if ((a % i) == 0) {
                value = true;
                break;
            }
        }
        if (value) {
            System.out.println("Number is not prime.");
        } else {
            System.out.println("Number is prime");
        }
    }
}

