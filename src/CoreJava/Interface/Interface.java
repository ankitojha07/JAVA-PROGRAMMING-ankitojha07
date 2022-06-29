package CoreJava.Interface;


    interface MyInterface
    {
        int x=9;
        void callMe();

    }

    class MyClass implements MyInterface
    {
        public void callMe()
        {
            System.out.println("Interface method overidden "+x);
        }

    }

    public class Interface
    {
        public static void main(String args[])
        {
            MyClass mc=new MyClass();
            mc.callMe();

        }
    }
