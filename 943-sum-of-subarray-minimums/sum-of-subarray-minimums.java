class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long mod=1000000007L;
        long ans=0;
        Stack<Integer>st= new Stack<>();
        for (int i=0;i<=n;i++) {
            while(!st.isEmpty() && (i==n||arr[st.peek()]>arr[i])) {
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                long right=i-mid;
                long leftCount=mid-left;
                ans = (ans+(leftCount*right%mod)*arr[mid])%mod;
            }st.push(i);
        }return (int) ans;
    }
}