class Solution {
    void helper(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        helper(nums, 0, nums.length-1);
        helper(nums, 0, k-1);
        helper(nums, k, nums.length-1);
    }
}