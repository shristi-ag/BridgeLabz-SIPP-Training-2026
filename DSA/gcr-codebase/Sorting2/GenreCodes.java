package Sorting2;

import java.util.*;

public class GenreCodes
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[21];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }

        for (int i = 1; i <= 20; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}