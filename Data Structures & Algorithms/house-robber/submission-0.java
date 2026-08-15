class Solution {
    int helper(int[] nums, int idx, int[] dp){
        if(idx > nums.length-1){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int not_take = helper(nums, idx+1, dp);
        int take = helper(nums, idx+2, dp) + nums[idx];

        return dp[idx] = Math.max(take, not_take);

    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}
