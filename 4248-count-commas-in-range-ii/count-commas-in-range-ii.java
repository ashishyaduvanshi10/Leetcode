class Solution {
    public long countCommas(long n) {
        long c=0;
        for (long x=1000;x<=n;x*=1000){
            c+= n-x+1;
        }return c;
    }
}