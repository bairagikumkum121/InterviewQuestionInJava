import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int value=sc.nextInt();
        for (int i = 1; i <=value; i++) {
                for (int k = value-1; k>=i; k--) {
                    System.out.print(" ");
                }
                for (int k = 1; k<=i; k++) {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
