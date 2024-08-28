import java.util.Scanner;

public class CheckStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean value=false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                value=true;
                break;
            }
        }
        if (value) {
            System.out.println("String is not palindrome");
        }else{
            System.out.println("String is palindrome");
        }
    }
}
