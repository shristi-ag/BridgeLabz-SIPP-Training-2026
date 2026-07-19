

public class UsernameValidator {

    public static boolean isValid(String username, int index) {

        // Base
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        // Check lowercase letter
        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(username, index + 1);
    }

    public static void main(String[] args) {

        String username1 = "abcdxyz";
        String username2 = "abcD123";

        System.out.println(isValid(username1, 0));
        System.out.println(isValid(username2, 0));
    }
}