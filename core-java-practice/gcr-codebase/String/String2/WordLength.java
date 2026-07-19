import java.util.Scanner;
public class WordLength {
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
        int words = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        String result[] = new String[words];
        String word = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
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
    public static String[][] wordLength(String words[]) {
        String result[][] = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        String words[] = splitText(text);
        String result[][] = wordLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t" +
                            Integer.parseInt(result[i][1])
            );
        }
    }
}