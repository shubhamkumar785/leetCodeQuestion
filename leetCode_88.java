
import java.util.Arrays;

public class leetCode_88 {
    public void merge(int[] nums1, int[] nums2, int m, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        leetCode_88 obj = new leetCode_88();
        obj.merge(nums1, nums2, m, n);

        System.out.println("Merged sorted array: " + Arrays.toString(nums1));
    }
}
