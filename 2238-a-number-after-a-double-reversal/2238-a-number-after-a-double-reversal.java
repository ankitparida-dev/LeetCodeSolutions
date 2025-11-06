class Solution {
    public boolean isSameAfterReversals(int num) {
       int temp=num,reverse=0,b,reverse2=0;
       while(temp>0){
        b=temp%10;
        reverse=reverse*10+b;
        temp/=10;
       }
       while(reverse>0){
          int c=reverse%10;
          reverse2=reverse2*10+c;
          reverse/=10;
       }
       if(num==reverse2){
        return true;
       }
       else{
        return false;
       }
    }
}