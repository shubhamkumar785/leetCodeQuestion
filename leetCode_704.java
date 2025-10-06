/*
     Binary Search
     intput: [-1, 0, 3, 5, 9, 12], target = 9;
     output: 4;

 */

class solution {
    public int Search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}

public class leetCode_704 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(sol.Search(nums, target));

    }
}