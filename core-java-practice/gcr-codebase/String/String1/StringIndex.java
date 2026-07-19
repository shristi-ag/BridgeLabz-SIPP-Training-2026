import java.util.Scanner;
public class StringIndex {
    public static void generateException(String text) {
        System.out.println(text.charAt(100));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.next();
        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Generated");
        }
        handleException(text);
    }
}