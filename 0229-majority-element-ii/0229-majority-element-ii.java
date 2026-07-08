class Solution {
    public List<Integer> majorityElement(int[] nums) {
          int candidate1=0,candidate2=0,count1=0,count2=0;
          for(int num:nums){
              if(count1==0 && num!=candidate2){
                candidate1=num;
                count1++;
              }
              else if(count2==0 && num!=candidate1){
                candidate2=num;
                count2++;
              }
              else if(num==candidate1){
                     count1++;
              }
              else if(num==candidate2){
                count2++;
              }
              else{
                count1--;
                count2--;
              }
          }
          count1=0;
          count2=0;
          for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
          }
          List <Integer> list=new ArrayList();
          int n=nums.length;
          if(count1>n/3){
            list.add(candidate1);
          }
          if(count2>n/3){
            list.add(candidate2);
          }
       return list;
    }
}