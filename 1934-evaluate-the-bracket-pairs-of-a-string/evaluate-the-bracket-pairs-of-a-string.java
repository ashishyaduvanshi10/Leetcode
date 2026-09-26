class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int len=s.length();
        HashMap<String,String>map=new HashMap<>();
        for(List<String>k:knowledge){
            map.put(k.get(0),k.get(1));
        }
        StringBuilder sb=new StringBuilder("");
        int i=0;
        while(i<len){
            if(s.charAt(i)=='('){
                int j=i+1;
                while(s.charAt(j)!=')')j++;
                sb.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i=j+1;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
            
            
        }
        return sb.toString();
    }
}