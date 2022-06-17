package LPUClasses;
@FunctionalInterface
interface MyInterface{
    public void sayHello(int x);
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyInterface m = (int x)-> System.out.println(x*x);
        m.sayHello(9);
        m.sayHello(10);
    }

}
