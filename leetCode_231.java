public class leetCode_231 {
    public static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i = i * 2;
        }
        return i == n;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}
