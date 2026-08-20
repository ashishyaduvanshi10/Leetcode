class Solution {
    public String reversePrefix(String s, int k) {
        int l=0;
        int r=k-1;
        char [] st=s.toCharArray();
        while(l<r){
            char temp=st[l];
            st[l]=st[r];
            st[r]=temp;
            l++;
            r--;
        }
        return new String(st);

    }
}