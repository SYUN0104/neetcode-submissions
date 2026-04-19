class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;

        s = s.toLowerCase();

        while(front < back){
            while(((s.charAt(front) < 'a' || s.charAt(front) > 'z') && (s.charAt(front) < '0' || s.charAt(front) > '9')) && front < back){
                front++;
            }

            while(((s.charAt(back) < 'a' || s.charAt(back) > 'z') && (s.charAt(front) < '0' || s.charAt(front) > '9')) && front < back){
                back--;
            }

            if(s.charAt(front) != s.charAt(back)){
                return false;
            }
            front++;
            back--;
        }

        return true;
    }
}
