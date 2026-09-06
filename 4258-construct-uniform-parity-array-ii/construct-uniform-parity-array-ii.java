class Solution {
    public boolean uniformArray(int[] nums1) {
        int modi=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2==1){
                modi=Math.min(modi,i);
            }
        }
        if(modi==Integer.MAX_VALUE)return true;
        for(int i:nums1){
            if(i%2==0 && i<modi) return false;
        }
        return true;
    }
}