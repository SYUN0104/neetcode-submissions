class Solution {
    public boolean isHappy(int n) {

        int slow = sqr(n);
        int fast = sqr(sqr(n));

        while(true){
            if(fast == 1){
                return true;
            }
            else if(fast == slow){
                break;
            }
            fast = sqr(sqr(fast));
            slow = sqr(slow);
        }
        return false;
    }

    private int sqr(int num){
        int result = 0;

        while(num > 0){
            result += (num % 10) * (num % 10);
            num /= 10;
        }

        return result;
    }
}
