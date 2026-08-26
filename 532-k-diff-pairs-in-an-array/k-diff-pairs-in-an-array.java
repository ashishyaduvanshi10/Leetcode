class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        if(k<0) return 0;
        for(int i:nums){
            if(set1.contains(i-k)){
                set2.add(i-k);
            }
            if(set1.contains(i+k)){
                set2.add(i);
            }
            set1.add(i);
        }
        return set2.size();
    }
}