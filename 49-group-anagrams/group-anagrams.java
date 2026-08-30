class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String k=new String(arr);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(str);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> l:map.values()){
            res.add(l);
        }
        return res;
    }
}