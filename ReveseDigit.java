import java.util.Scanner;

public class ReverseNumberInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int reverseNumber=0;
        while (number>0) {
            int temp=number%10;
            number=number/10;
           reverseNumber=reverseNumber*10+temp;
        }
        System.out.println(reverseNumber);
}
}
