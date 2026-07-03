class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List <String>> map=new HashMap();
        for(String str:strs){
            int freq[]=new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int ele:freq){
                sb.append(ele).append("$");
            }
            String key=sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List <String> li=new ArrayList();
                li.add(str);
                map.put(key,li);
            }
        }
        return new ArrayList(map.values());
    }
}