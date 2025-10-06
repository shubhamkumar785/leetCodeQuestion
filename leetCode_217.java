import java.util.*;

public class leetCode_217 {
    public static boolean containDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(containDuplicate(arr));
    }
}
