class Solution {
    public int firstUniqChar(String str) {
         HashMap <Character,Integer> map=new HashMap<>();
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         map.put(ch,map.getOrDefault(ch,0)+1);
     }
     for(int i=0;i<str.length();i++){
         if(map.get(str.charAt(i))==1){
             return i;
         }
     }
    return -1;
    }
}