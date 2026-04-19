class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 2){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String sCompare = new StringBuilder(s).reverse().toString();
        
        return s.equals(sCompare);
    }
}
