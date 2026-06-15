package Methods3;

import java.util.Scanner;

public class NumberChecker3 {

    static int[] storeDigits(int number) {

        String str = String.valueOf(number);

        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    static int[] reverseArray(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Palindrome = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));
    }
}

