package Methods3;

import java.util.Scanner;

public class NumberChecker2 {

    static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    static int[] storeDigits(int number) {

        int[] digits = new int[countDigits(number)];

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    static double sumSquares(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    static int[][] frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Sum = " + sumDigits(digits));
        System.out.println("Sum Squares = " + sumSquares(digits));
        System.out.println("Harshad Number = " + isHarshad(number, digits));

        int[][] freq = frequency(digits);

        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
        }
    }
}

