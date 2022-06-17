package LPUClasses;
@FunctionalInterface
interface FunInterface{
    public void say(String s);
}
public class DemoFunInterface implements FunInterface {
    public void say(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        DemoFunInterface d  = new DemoFunInterface();
        d.say("Good morning LPU!");
    }
}
