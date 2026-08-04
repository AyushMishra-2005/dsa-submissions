class Solution {
    public int removeElement(int[] nums, int val) {
        int gap = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                gap++;
                continue;
            }
            nums[i-gap] = nums[i];
        }

        return nums.length-gap;

    }
}









