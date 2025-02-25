package test;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int i = longestConsecutive(new int[]{1, 0, 1, 2});
        System.out.println(i);
    }

    public static int longestConsecutive(int[] nums) {
        int res = 0;
        if (nums.length == 0) {
            return nums.length;
        }

        if (nums.length == 1) {
            return nums.length;
        }

        Arrays.sort(nums);
        int slow = 0;
        int fast = 1;
        int repeat = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                repeat++;
            } else if (!(nums[fast] == nums[fast - 1] + 1)) {
                repeat = 0;
                slow = fast;
            }

            res = Math.max(res, fast - slow + 1 - repeat);
        }

        return res;
    }
}
