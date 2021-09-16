class Solution {
    public boolean isValid(String s) {
        Stack<Character> close = new Stack<Character>();
        char[] parens = s.toCharArray();
        if (parens.length%2 != 0) return false;
        for(char paren:parens){
            if(paren=='[') close.push(']');
            else if(paren=='(') close.push(')');
            else if(paren=='{') close.push('}');
            else if(close.isEmpty() || paren!=close.pop()){
                return false;
            }
        }
        return close.isEmpty();
    }
}
