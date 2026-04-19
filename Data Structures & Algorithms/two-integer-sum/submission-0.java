class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(int i = 0 ; i < nums.length; i++){
            if(target - nums[i] == nums[i]){
                if(map.get(nums[i]).size() >= 2){
                    return new int[] { map.get(nums[i]).get(0), map.get(nums[i]).get(1) };
                }
            }
            else{
                if(map.containsKey(target - nums[i])){
                    return new int[] { map.get(nums[i]).get(0), map.get(target - nums[i]).get(0) };
                }
            }
        }
        return new int[] {0, 1};
    }
}
