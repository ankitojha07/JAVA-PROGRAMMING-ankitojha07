package CoreJava.Abstraction;

interface one{
    void yes(char a);
}

interface two{
    void no();
}
class C implements one{
    public void yes(char a){
        System.out.println(a);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        C c = new C();
        c.yes('c');
    }
}