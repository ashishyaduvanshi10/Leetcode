class Solution {
    public int arrangeCoins(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            long coins=(long)(mid*(long)(mid+1))/2;

            if(coins<=n){
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return h;

    }
}