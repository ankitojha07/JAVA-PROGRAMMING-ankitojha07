package CoreJava.Generics;
class Gen<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T Get(){
        return obj;
    }
}

public class TestGen {
    public static void main(String[] args) {
        Gen<Integer> m1 = new Gen<Integer>();
        Gen<String> m2 = new Gen<String>();

        m1.add(10);
        m2.add("String");

        System.out.println(m1.Get());
        System.out.println(m2.Get());
    }
}
