class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 == 1) return false;

        Stack<Character>  st = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(isSame(top, ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public boolean isSame(char top, char ch){
        if(top == '(' && ch == ')') return true;
        if(top == '[' && ch == ']') return true;
        if(top == '{' && ch == '}') return true;
        return false;
    }
}