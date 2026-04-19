class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int r = 0; r < s.length(); r++) {
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), r);
                max = Math.max(r - l + 1, max);
            }

            // duplication detected
            else {
                int newL = map.get(s.charAt(r)) + 1;
                
                for(int i = l; i < newL; i++) {
                    map.remove(s.charAt(i));
                }
                map.put(s.charAt(r), r);
                l = newL;
            }
        }
        return max;
    }
}
