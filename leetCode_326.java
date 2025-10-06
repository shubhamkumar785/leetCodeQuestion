public class leetCode_326 {
    public static boolean isPowerOfThree(int n){
        long i = 1;
        while( i< n){
            i = i * 3;
        }
        return i == n;
    }
    public static void main(String[] args){
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}
