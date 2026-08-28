class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>lst=new ArrayList<>();
        for(int i:nums){
            if(map.get(i)>1 || map.containsKey(i+1) || map.containsKey(i-1))continue;
            else lst.add(i);
        }
        return lst;
    }
}