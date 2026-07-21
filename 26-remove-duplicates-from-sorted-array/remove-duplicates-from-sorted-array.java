class Solution {
    public int removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int idx = 0;
        for(int num : set){
            arr[idx++] = num;
        }
        return idx;
    }
}