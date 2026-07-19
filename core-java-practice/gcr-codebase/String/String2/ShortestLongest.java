import java.util.Scanner;
public class ShortestLongest {
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
    public static int[] shortestLongest(String data[][]) {
        int shortest = 0;
        int longest = 0;
        for (int i = 1; i < data.length; i++) {
            if (Integer.parseInt(data[i][1]) <
                    Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }
            if (Integer.parseInt(data[i][1]) >
                    Integer.parseInt(data[longest][1])) {

                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        String words[] = splitText(text);
        String data[][] = wordLength(words);
        int result[] = shortestLongest(data);
        System.out.println("Shortest Word: "
                + data[result[0]][0]);
        System.out.println("Longest Word: "
                + data[result[1]][0]);
    }
}