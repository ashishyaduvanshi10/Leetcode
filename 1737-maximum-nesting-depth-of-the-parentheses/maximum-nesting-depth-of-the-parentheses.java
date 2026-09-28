class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                count=Math.max(count,stack.size());
            }
            else if(ch==')'){
                stack.pop();
            }
        }
        return count;
    }
}