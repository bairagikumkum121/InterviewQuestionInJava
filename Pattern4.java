public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            int k=6-i;
            for (int j = 4; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (i>j) {
                    System.out.print(k);
                    k++;
                }else{
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
    }
}
