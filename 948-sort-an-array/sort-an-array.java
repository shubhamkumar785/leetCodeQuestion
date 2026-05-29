class Solution {
    public int[] sortArray(int[] nums) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : nums){
            pq.add(ele);
        }
        while(!pq.isEmpty()){
            nums[idx++] = pq.remove();
        }
        return nums;
    }

    
}