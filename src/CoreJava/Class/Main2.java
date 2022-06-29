package CoreJava.Class;

// inner class

public class Main2 {
    private int methodA(int elem){
        class SubMain{
            private int methodB(){
                System.out.println("30");
                if (elem <61){
                    return 144;
                } else {
                    return 176;
                }
            }
        }
        SubMain sm = new SubMain();
        return sm.methodB();

    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        System.out.println(m.methodA(75));
    }
}
