import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        String str = sc.nextLine();
        String newString = "";
        newString += str.replace(" ", "");
        System.out.println(newString);
    }
}
