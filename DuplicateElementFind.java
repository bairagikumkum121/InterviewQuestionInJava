public class DuplicateElementFind {
    public static void main(String[] args) {
        String[] my_array={"bcd","abd","jude","oiu","bcd","oiu"};
        for(int i=0;i<my_array.length;i++){
            for(int j=i+1;j<my_array.length;j++){
                if (my_array[i].equals(my_array[j])) {
                    System.out.println("duplicate element is: "+my_array[i]);
                }
            }
        }
    }
}
