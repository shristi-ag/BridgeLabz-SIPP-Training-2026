package SlidingWindow;

public class SlidingWindowFixed {
    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpu = {10, 15, 12, 20, 18, 25, 17};

        System.out.println(maxSubarrayOfSizeK(cpu, 5));
    }
}