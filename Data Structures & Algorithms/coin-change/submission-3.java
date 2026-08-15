class Solution {
    int helper(int[] coins, int amount, int idx, int[][] dp){
        if(amount == 0){
            return 0;
        }

        if(idx < 0 || amount < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[idx][amount] != -1){
            return dp[idx][amount];
        }

        int take = Integer.MAX_VALUE;
        if(amount >= coins[idx]){
            int result = helper(coins, amount-coins[idx], idx, dp);
            if(result != Integer.MAX_VALUE){
                take = 1 + result;
            }
        }

        int not_take = helper(coins, amount, idx-1, dp);
        
        return dp[idx][amount] = Math.min(take, not_take);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        int ans = helper(coins, amount, coins.length-1, dp);

        return ans == Integer.MAX_VALUE? -1 : ans;
    }
}
