package OOPs;

 class Box{
    double l;
    double b;
    double h;

    // without any parameter
    Box(){
        this.l = -1.0;
        this.b = -1.0;
        this.h = -1.0;
    }

    // single parameter
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box (Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
    public void information(){
        System.out.println("Running the box.");
    }
}

public class InheritanceOne {
    public static void main(String[] args) {
        Box box = new Box(4);
        System.out.println(box.l + box.b + box.h);
    }
}
