package test;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3};
        int i = removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ' ');
        }
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        while (right < len) {
            int index = 0;
            while (right < len && nums[left] == nums[right]) {
                right++;
                index++;
            }
            if (index > 2) {
                int temp = left + 2;
                int tempRight = right;
                while (tempRight < len) {
                    nums[temp] = nums[tempRight];
                    temp++;
                    tempRight++;
                }
                len -= (index - 2);
                left = left + 2;
                right = left;
            }else {
                left = right;
            }
        }

        return len;
    }
}
