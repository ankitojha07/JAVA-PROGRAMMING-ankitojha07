package GeeksforGeeks;

public class PasswordChecker {
    public static void main(String[] args) {
        String s = "HELLO 9";
        if (s.matches(".*[A-Z].*") && s.matches(".*\\d.*")){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
