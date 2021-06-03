// 1021 Remove Outermost Parentheses 

class Solution {
    public String removeOuterParentheses(String S) {
        Stack <Character> charStack = new Stack<Character> ();
        StringBuilder  s = new StringBuilder();
        int begin = 0;
        char[] c = S.toCharArray();
        
        for (int i = 0 ; i< c.length; i++){
            s.append(c[i]);
            
            if(c[i] =='('){
                charStack.push('(');
            }else{
                charStack.pop();
            }
            
            if(charStack.isEmpty()){
              s.deleteCharAt(begin);
              s.deleteCharAt(s.length()-1);
                begin = s.length();
                
            }
        }
        return s.toString();
        
    }
}