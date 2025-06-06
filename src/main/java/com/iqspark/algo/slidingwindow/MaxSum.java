package com.iqspark.algo.slidingwindow;

public class MaxSum {

    public static int maxSumSmallArr(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0)
            return 0;

        int windowSum = 0;
        int windowStart = 0;
        int minLength = Integer.MAX_VALUE;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while(windowSum >= k) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = maxSumSmallArr(arr, 7);
        System.out.println(length);
    }
}
