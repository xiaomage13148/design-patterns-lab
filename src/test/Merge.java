package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 56. 合并区间
 * TODO 待完善
 */
public class Merge {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        int[][] merge = merge(intervals);
        Arrays.asList(merge).forEach(item -> System.out.println(item[0] + "," + item[1]));
    }

    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < intervals.length; i++) {
            int min = intervals[i][0];
            int minIndex = i;
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] < min) {
                    min = intervals[j][0];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int[] temp = intervals[minIndex];
                intervals[minIndex] = intervals[i];
                intervals[i] = temp;
            }
        }
        List<Integer> item = new ArrayList<>();
        item.add(intervals[0][0]);
        item.add(intervals[0][1]);
        list.add(item);
        for (int i = 1; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (left >= item.get(0) && left <= item.get(1)) {
                item.set(1, Math.max(item.get(1), right));
            } else if (left >= item.get(1)) {
                item = new ArrayList<>();
                item.add(left);
                item.add(right);
                list.add(item);
            }
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }

        return res;
    }
}
