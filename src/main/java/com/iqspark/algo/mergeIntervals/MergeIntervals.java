package com.iqspark.algo.mergeIntervals;

import java.util.*;

import static java.lang.Integer.compare;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        //sort the list
        intervals.sort(Comparator.comparingInt(a -> a.start));

        Iterator<Interval> itr = intervals.iterator();
        Interval i = itr.next();
        int start = i.start;
        int end = i.end;
        List<Interval> newIntervals = new ArrayList<>();
        while (itr.hasNext()) {
            Interval interval = itr.next();
            if (interval.start < end) {
                end = Integer.max(end, interval.end);
            } else {
                Interval int1 = new Interval(start, end);
                newIntervals.add(int1);
                start= interval.start;
                end = interval.end;
            }
        }
        Interval int1 = new Interval(start, end);
        newIntervals.add(int1);
        return newIntervals;
    }

    public static void main(String[] args) {

        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}