
import java.util.Arrays;

/*
      Two sum
      nums = [2, 7, 11, 15], target = 9
      output = [0,1]
*/

class solution {
    public int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

}

public class leetCode_01 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(sol.sum(nums, target)));
    }
}
