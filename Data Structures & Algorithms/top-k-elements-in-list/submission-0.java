class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(freq.size() + 1);

        for (int i = 0; i <= nums.length; i++) {
            arr.add(new ArrayList<>());
        }

        for(int key : freq.keySet()){
            arr.get(freq.get(key)).add(key);
        }
        int[] ans = new int[k];
        int counter = 0;

        for(int i = arr.size() - 1; i >= 0 && counter < k; i--){
            for(int num : arr.get(i)){
                ans[counter++] = num;
                if(counter == k) break;
            }
        }
        return ans;
    }
}