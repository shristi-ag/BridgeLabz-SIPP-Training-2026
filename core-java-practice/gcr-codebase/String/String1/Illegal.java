import java.util.Scanner;

public class Illegal {
    public static void generateException(String text) {
        System.out.println(text.substring(4, 1));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(4, 1));
        }
        catch (RuntimeException e) {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.next();
        try {
            generateException(text);
        }
        catch (RuntimeException e) {
            System.out.println("Exception Generated");
        }
        handleException(text);
    }
}