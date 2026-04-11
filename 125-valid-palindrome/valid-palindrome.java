class Solution {
    public boolean isAlphaNum(char ch){
        if(ch >= '0' && ch <= '9' || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPalindrome(String s) {
        int low =0, high = s.length()-1;

        s = s.toLowerCase();

        while(low < high){
            if(!isAlphaNum(s.charAt(low))){
                low++;
                continue;
            }
            if(!isAlphaNum(s.charAt(high))){
                high--;
                continue;
            }
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}