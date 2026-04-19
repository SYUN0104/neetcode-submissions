class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>(); 
        HashMap<Character, Integer> mapT = new HashMap<>(); 

        for(char i : s.toCharArray()){
            mapS.put(i, (mapS.containsKey(i)) ? mapS.get(i) + 1 : 0);
        }

        for(char i : t.toCharArray()){
            mapT.put(i, (mapT.containsKey(i)) ? mapT.get(i) + 1 : 0);
        }

        return mapS.equals(mapT);
    }
}
