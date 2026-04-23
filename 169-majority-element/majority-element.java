class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int freq = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq > n/2){
                return arr[i];
            }
        }
        return -1;
    }

}