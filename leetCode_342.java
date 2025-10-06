public class leetCode_342 {
    public static boolean isPowerOfFour(int n){
        long i = 1;
        while(i < n){
            i = i * 4;
        }
        return i == n;
    }
    public static void main(String [] args){
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}
