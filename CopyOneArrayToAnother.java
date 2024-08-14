import java.util.Arrays;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        int[] a={24,14,56,15,36,56,77,18,29,49};
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("A array is:- "+Arrays.toString(a));
        System.out.println("B array is:- "+Arrays.toString(b));
    }
}
