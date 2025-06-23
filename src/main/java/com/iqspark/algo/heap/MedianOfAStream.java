package com.iqspark.algo.heap;

import java.util.*;

class MedianOfAStream {

    public PriorityQueue maxHeap;
    public PriorityQueue minHeap;

    public MedianOfAStream() {



    }

    public void insertNum(int num) {


    }

    public double findMedian() {
        return 0;
    }

    public static void main(String[] args) {
        MedianOfAStream medianOfAStream = new MedianOfAStream();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(5);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(4);
        System.out.println("The median is: " + medianOfAStream.findMedian());
    }
}