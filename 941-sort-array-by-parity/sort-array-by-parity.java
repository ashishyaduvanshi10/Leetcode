class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        for(int i: nums){
            if(i%2==0) {
                arr[j]=i;
                j++;
            }
        }
        for(int i: nums){
            if(i%2!=0) {
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
}