public class ChecArraysContainkOnlyEven {

    public static void main(String[] args) {
        int a[]={2,4,6,2,6,8};
        int count=0;
        int count1=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                count++;
            }
            if (a[i]%2==1) {
                count1++;
            }
        }
        if (a.length==count) {
            System.out.println("Arrays contain only even");
        }else if (a.length==count1) {
            System.out.println("Array contain only odd.");
        }else{
            System.out.println("Array contain even aad odd both.");
        }
    }
}
