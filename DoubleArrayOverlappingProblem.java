package myinterview;

import java.util.Arrays;

//Problem :- Double array overlapping problem :- {{1,3},{2,7},{8,9},{11,13}}==convert it in ==>{{1,7},{8,9},{11,13}}
//In place removal ----no extra space.

public class DoubleArrayOverlappingProblem {

	public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 7}, {8, 9}, {11, 13}};
        merge(intervals);
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static void merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[index][1]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        // Remove remaining intervals if any
        while (index < intervals.length - 1) {
            intervals[index + 1] = null;
            index++;
        }
    }

}

//with extra space 

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] intervals = {{1, 3}, {2, 7}, {8, 9}, {11, 13}};
//        int[][] mergedIntervals = merge(intervals);
//        for (int[] interval : mergedIntervals) {
//            System.out.println(Arrays.toString(interval));
//        }
//    }
//
//    public static int[][] merge(int[][] intervals) {
//        if (intervals.length == 0) {
//            return new int[0][];
//        }
//        
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        
//        List<int[]> merged = new ArrayList<>();
//        merged.add(intervals[0]);
//        
//        for (int i = 1; i < intervals.length; i++) {
//            int[] currentInterval = intervals[i];
//            int[] lastMergedInterval = merged.get(merged.size() - 1);
//            if (currentInterval[0] <= lastMergedInterval[1]) {
//                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentInterval[1]);
//            } else {
//                merged.add(currentInterval);
//            }
//        }
//        
//        return merged.toArray(new int[merged.size()][]);
//    }
//}

