import java.util.Arrays;

public class TwoArraysContainSameElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={1,2,5,4};
        Arrays.sort(a);
        Arrays.sort(b);
        boolean value=false;
        if (a.length==b.length) {
            for (int i = 0; i < b.length; i++) {
                if (a[i]!=b[i]) {
                    value=true;
                }
            }
        }
        if (value) {
            System.out.println("A and B does not contain same lement.");
        }else{
            System.out.println("A and B contain same elemnt.");
        }
    }
}
