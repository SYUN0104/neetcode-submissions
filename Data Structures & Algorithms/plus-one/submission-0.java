class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0 ; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }

            digits[i] = 0;
        }
        if(digits[0] == 0){
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            System.arraycopy(digits, 0, newArr, 1, digits.length);

            return newArr;
        }
        return digits;
    }
}
