class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // 1. 왼쪽 포인터가 영문자/숫자가 아니면 건너뜀
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } 
            // 2. 오른쪽 포인터가 영문자/숫자가 아니면 건너뜀
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } 
            // 3. 둘 다 유효한 문자일 때 비교 (대소문자 무시)
            else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}