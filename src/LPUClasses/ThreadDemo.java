package LPUClasses;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);
        t.setName("K20-PK");
        System.out.println(t);

        try {
            for (int i = 0; i<5;i++){
                System.out.println("i : "+ i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e){
            System.out.println("Thread Exception " + e);
        }

    }
}
