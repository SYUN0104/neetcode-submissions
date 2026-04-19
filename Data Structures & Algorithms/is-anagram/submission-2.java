class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>(); 
        HashMap<Character, Integer> mapT = new HashMap<>(); 

        for(char i : s.toCharArray()){
            mapS.put(i, mapS.getOrDefault(i, 0) + 1);
        }

        for(char i : t.toCharArray()){
            mapT.put(i, mapT.getOrDefault(i, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
