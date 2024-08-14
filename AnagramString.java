public class AnagramString {
    public static void main(String[] args) {
        String str1 = "aaba";
        String str2 = "baac";
        int count[] = new int[256];
        boolean value = true;
        
        

        for (int i = 0; i < str1.length(); i++) {
            if (str1.length() != str2.length()) {
                value = false;
                break;
            }
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                value = false;
            }
        }
        if (value) {
            System.out.println("String is Anagran.");
        } else {
            System.out.println("String is not anagram");
        }

    }
}
