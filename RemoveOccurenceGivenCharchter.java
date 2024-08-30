import java.util.Scanner;

public class RemoveOccurenceCharchter {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String str=sc.next();
    String str2="";
    System.out.println("Enter charchter: ");
    char c=sc.next().charAt(0);
    for (int i = 0; i < str.length(); i++) {
        if (c!=str.charAt(i)) {
            str2+=str.charAt(i);
        }
    }
    System.out.print(str2);

}
}
