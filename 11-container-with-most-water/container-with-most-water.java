class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int leftPointer = 0, rightPointer = height.length-1;

        while(leftPointer < rightPointer){
            int wide = rightPointer - leftPointer;
            int ht = Math.min(height[leftPointer], height[rightPointer]);
            int area = wide * ht;
            maxWater = Math.max(maxWater, area);

            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return maxWater;
    }
}