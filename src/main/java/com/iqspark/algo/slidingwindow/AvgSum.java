package com.iqspark.algo.slidingwindow;

import java.util.Arrays;

public class AvgSum {

    public static double[] getAvgSum(int k, int[] arr) {
        if(k==0 || arr== null || arr.length==0)
            return new double[0];

        int windowSum=0;
        int windowStart=0;
        double[] result = new double[arr.length-k+1];

        for(int windowEnd = 0; windowEnd<arr.length; windowEnd++){
            windowSum = arr[windowEnd] + windowSum;
            if(windowEnd >= k-1){
                result[windowStart]= (double) windowSum /k;
                windowSum=windowSum-arr[windowStart];
                windowStart++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        double[] avg = getAvgSum(k, arr);
        System.out.println(Arrays.toString(avg));
    }
}
