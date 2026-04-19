class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 

        int lenMax = 0;

        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i - 1)){
                int lenCnt = 1;

                while(set.contains(i + 1)){
                    lenCnt++;
                    i++;
                }

                lenMax = Math.max(lenCnt, lenMax);
            }
        }
        return lenMax;
    }
}
