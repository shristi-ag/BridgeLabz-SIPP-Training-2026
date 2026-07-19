public class NullPointer {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handle() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }
    }
    public static void main(String[] args) {
        try {
            generateException();
        }
        catch (NullPointerException e) {
            System.out.println("Exception Generated");
        }
        handle();
    }
}