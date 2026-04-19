class Solution {
    public int climbStairs(int n) {
        if(n < 3){
            return n;
        }

        int[] fibo = {1, 2};
        for(int i = 2; i < n; i++){
            fibo[i % 2] = fibo[0] + fibo[1];
        }
        return fibo[(n + 1) % 2];
    }
}
