class AnnonuymsClass{
    public void show(){
        System.out.println("Normal show called");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnnonuymsClass a=new AnnonuymsClass(){
            @Override
            public void show(){
                System.out.println("ovverride show called.");
            }
        };
        a.show();
    }
}