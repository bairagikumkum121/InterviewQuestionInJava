import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int value=sc.nextInt();
        for (int i = 1; i <=value; i++) {
            for (int j = i; j <=i; j++) {
                for (int k = value-1; k>=i; k--) {
                    System.out.print(" ");
                }
                for (int k = 1; k<=i; k++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}