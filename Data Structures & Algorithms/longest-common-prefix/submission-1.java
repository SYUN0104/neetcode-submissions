class Solution {
    public String longestCommonPrefix(String[] strs) {
        int last = strs[0].length();
        for(int i = 1 ; i < strs.length; i++){
            last = Math.min(last, strs[i].length());
            for(int j = 0 ; j < last; j++){
                if(strs[0].charAt(j) != strs[i].charAt(j)){
                    last = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, last);
    }
}