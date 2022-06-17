package LPUClasses;

enum Laptops{
    MAC(1), LEN(3), DELL(7),AC(9);
    private  int pricing;
    Laptops(int pricing){
        this.pricing = pricing;
    }
    public int fetchPrice(){
        return  this.pricing;
    }
}
public class Main {
    public static void main(String[] args) {
        Laptops lappy[] = Laptops.values();
        for (Laptops lp:lappy){
            System.out.println(lp.fetchPrice());
        }
    }
}
