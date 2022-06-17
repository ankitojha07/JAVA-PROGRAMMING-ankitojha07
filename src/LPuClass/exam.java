package LPuClass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class exam {
    public static void main(String[] args) {
        double inp1, inp2,result;
        char op;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operator : ");
        op = sc.next().charAt(0);

        System.out.println("Enter 1st value :");
        inp1 = sc.nextDouble();

        System.out.println("Enter 2nd value : 1");
        inp2 = sc.nextDouble();

        switch (op){
            case '+': result = inp1+inp2;
                System.out.println("Addition : "+result);
                break;
            case '-': result = inp1-inp2;
                System.out.println("Substraction : "+result);
                break;
            case '*': result = inp1*inp2;
                System.out.println("Multi  : "+result);
                break;
            case '/':
                if (inp2 ==0){
                    System.out.println("Cannot divide by 0.");
                } else {
                    result = inp1 / inp2;
                    System.out.println("Division : " + result);
                }
                break;
            case '%': result = inp1%inp2;
                System.out.println("Remainder : "+result);
                break;
        }
    }
}