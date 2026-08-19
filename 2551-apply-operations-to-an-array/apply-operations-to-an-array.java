class Solution {
    public int[] applyOperations(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int i=0;
        for(int in=0;in < n;in++) {
            if (nums[in]!=0) {
                nums[i]=nums[in];
                if (i!=in)nums[in]=0;
                i++;
            }
        }
        return nums;
    }
}