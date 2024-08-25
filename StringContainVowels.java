import java.util.Scanner;

public class StringContainsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean value = false;
        // Approch-1
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'u') {
                value = true;
                break;
            }
        }
        if (value) {
            System.out.println("String contains vowels");
        } else {
            System.out.println("String is not containe vowels.");
        }
       // Approch-2
        if (str.toLowerCase().matches(".*[aeiou]*.")) {
            System.out.println("String contains vowels");

        } else {
            System.out.println("String is not containe vowels.");

        }
    }
}
