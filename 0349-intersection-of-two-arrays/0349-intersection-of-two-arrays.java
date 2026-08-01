class Solution {
    public int[] intersection(int[] a, int[] b) {
       HashSet <Integer> set=new HashSet<>();
       HashSet <Integer> set2=new HashSet<>();
       for(int x:a){
        set.add(x);
       }
       for(int x:b){
        if(set.contains(x)){
            set2.add(x);
        }
       }
       int c[]=new int[set2.size()];
       int i=0;
       for(int x:set2){
        c[i++]=x;
       }
       return c;
    }
}