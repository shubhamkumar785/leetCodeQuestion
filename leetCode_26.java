/*
 *  remove duplicates
 *  Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
 * 
 */
class solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

public class leetCode_26 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { 1, 1, 2 };
        System.out.println(sol.removeDuplicates(nums));
    }
}
