class Solution {
    public boolean isValid(String s) {
        Stack<Character> close = new Stack<Character>();
        char[] parens = s.toCharArray();
        //If the size of the string is odd then this must be false
        if (parens.length%2 != 0) return false;
        for(char paren:parens){
            //For every valid opener push a valid closer
            if(paren=='[') close.push(']');
            else if(paren=='(') close.push(')');
            else if(paren=='{') close.push('}');
            //If the next characcter is not an opener it has to be a closer
            //If the closer is not the one expected (top of the stack)
            //then return false
            //If there is a closer but the stack is already empty also
            //return false
            else if(close.isEmpty() || paren!=close.pop()){
                return false;
            }
        }
        return close.isEmpty();
    }
}
