class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> checkMap = new HashMap<>();

        for(String i : strs){
            char[] tempCharArr = i.toCharArray();
            int[] counts = new int[26];
            for(char c : tempCharArr)
            {
                counts[c - 'a']++;
            }

            StringBuilder hashBuilding = new StringBuilder();
            for(int j = 0 ; j < 26; j++){
                if(counts[j] != 0){
                    hashBuilding.append((char)('a' + j));
                    hashBuilding.append(counts[j]);
                }
            }
            String hashKey = hashBuilding.toString();
            if(!checkMap.containsKey(hashKey)){
                checkMap.put(hashKey, new ArrayList<>());
            }
            checkMap.get(hashKey).add(i);
        }
        
        return new ArrayList<>(checkMap.values());
    }
}
