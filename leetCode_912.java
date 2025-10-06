
import java.util.Arrays;

/*
    sort an array
    Input: nums = [5,2,3,1]
    Output: [1,2,3,5]
 */

class solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

public class leetCode_912 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { 5, 2, 3, 1 };
        System.out.println(Arrays.toString(sol.sortArray(nums)));
    }
}
