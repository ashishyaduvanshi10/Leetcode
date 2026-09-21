class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch!='*')st.push(ch);
            else st.pop();
        }
        StringBuilder res=new StringBuilder();
        while(!st.empty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}