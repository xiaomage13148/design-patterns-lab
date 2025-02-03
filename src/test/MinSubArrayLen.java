package test;

public class MinSubArrayLen {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    /**
     * TODO 断点排查，出现超时问题
     * @param target
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int res = 0;
        while (++res <= nums.length) {
            int l = 0;
            int r = l + res - 1;
            while (r < nums.length) {
                int sum = 0;
                int index = l;
                while (index <= r) {
                    sum += nums[index];
                    index++;
                }
                if (sum >= target) {
                    return res;
                }
                l++;
                r++;
            }
        }

        return 0;
    }
}
