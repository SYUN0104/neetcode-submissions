class Solution {
    public int search(int[] nums, int target) {
        int front = 0;
        int back = nums.length - 1;

        if(target == nums[front]){
            return front;
        }
        if(target == nums[back]){
            return back;
        }

        while(back - front > 1){
            int mid = (back + front) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                front = mid;
            }
            else if(nums[mid] > target){
                back = mid;
            }
        }
        return -1;
    }
}
