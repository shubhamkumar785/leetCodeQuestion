
import java.util.Arrays;

/*
      Single number II
      Input: nums = [2,2,3,2]
      Output: 3
 */

class solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

public class leetCode_137 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { 2, 2, 3, 2 };
        System.out.println(sol.singleNumber(nums));
    }

}
