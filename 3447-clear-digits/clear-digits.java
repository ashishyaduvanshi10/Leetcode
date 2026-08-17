class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder("");
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z') st.push(ch);
            if(ch<'a' || ch>'z' && !st.isEmpty()) st.pop();
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}