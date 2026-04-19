class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curProfit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(curProfit + (prices[i + 1] - prices[i]) < 0){
                curProfit = 0;
            }
            else{
                curProfit += prices[i + 1] - prices[i];
                if(curProfit > max){
                    max = curProfit;
                }
            }
        }
        
        return max;
    }
}
