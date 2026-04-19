class Solution {
    private int[] dpData;
    public int minCostClimbingStairs(int[] cost) {
        dpData = new int[cost.length + 1];
        Arrays.fill(dpData, -1);

        return dpData[0] = Math.min(dp(cost, 1), dp(cost, 2));
    }

    private int dp(int[] cost, int k){
        if(k > cost.length){
            return 0;
        }

        if(dpData[k] != -1){
            return dpData[k];
        }

        return dpData[k] = Math.min(dp(cost, k + 1), dp(cost, k + 2)) + cost[k - 1];
    }
}
