package com.iqspark.algo.slidingwindow;

import java.util.Arrays;

public class Problem1 {
    public static double[] slidingWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new double[0];
        }
        double[] result = new double[arr.length - k + 1];

        for (int i = 0; i <= arr.length - k; i++) {
            double sum = 0;

            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }
            double avg = sum / k;
            result[i] = avg;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        double[] result = slidingWindow(arr, k);
        System.out.println(Arrays.toString(result));
    }
}


