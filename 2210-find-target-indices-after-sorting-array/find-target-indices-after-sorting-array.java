class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;
        for(int ele : nums){
            if(ele==target) count++;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                arr.add(i);
               
            }
        }return arr;
    }
}