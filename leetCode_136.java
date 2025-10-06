
import java.util.Arrays;

/*
    Single number
    Input: nums = [2,2,1]
    Output: 1

 */

class solution {
    public int singleNUmber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

public class leetCode_136 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { 2, 2, 1 };
        System.out.println(sol.singleNUmber(nums));
    }
}
