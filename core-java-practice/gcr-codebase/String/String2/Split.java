import java.util.Scanner;
public class Split {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
        }
        return count;
    }
    public static String[] splitText(String text) {
        int length = findLength(text);
        int words = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        String result[] = new String[words];
        String word = "";
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            }
            else {
                result[index] = word;
                index++;
                word = "";
            }
        }
        result[index] = word;
        return result;
    }
    public static boolean compareArrays(String arr1[], String arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        String custom[] = splitText(text);
        String builtIn[] = text.split(" ");
        System.out.println("Custom Split:");
        for (int i = 0; i < custom.length; i++) {
            System.out.println(custom[i]);
        }
        System.out.println();
        System.out.println("Built-in Split:");
        for (int i = 0; i < builtIn.length; i++) {
            System.out.println(builtIn[i]);
        }
        System.out.println();
        System.out.println("Same Result: " + compareArrays(custom, builtIn));
    }
}