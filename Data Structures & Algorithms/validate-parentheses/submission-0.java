class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(char s : str.toCharArray()){
            if(s=='(' || s=='{' || s=='['){
                stack.push(s);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if( (s==')' && top!='(') || (s=='}' && top!='{') || (s=='[' && top!=']') ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
