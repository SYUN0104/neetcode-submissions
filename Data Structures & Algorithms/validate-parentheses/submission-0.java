class Solution {
    public boolean isValid(String s) {
        if("}])".indexOf(s.charAt(0)) != -1){
                return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        int cur = 1;
        while(cur < s.length()){
            if(stack.isEmpty() && "}])".indexOf(s.charAt(cur)) != -1){
                return false;
            }

            if("{[(".indexOf(s.charAt(cur)) != -1){
                stack.push(s.charAt(cur));
            }
            else{
                char e = stack.pop();
                char curChar = s.charAt(cur);
                if(!(e == '(' && curChar == ')' || e == '{' && curChar == '}' || e == '[' && curChar == ']')){
                    return false;
                }
            }
            cur++;
        }
        return stack.isEmpty();
    }
}
