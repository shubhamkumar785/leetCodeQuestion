class Solution {
    public int lengthOfLastWord(String str) {
        int length = 0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                length++;
            }
            else if(length > 0){
                break;
            }

        }
        return length;
    }
}