class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sum = new int[nums.length];

        sum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i - 1] * nums [i];
        }

        int right_sum = 1;
        for(int i = nums.length - 1; i > 0; i--){
            sum[i] = sum[i - 1] * right_sum;
            right_sum *= nums[i];
        }
        sum[0] = right_sum;
        return sum;
    }
}  
