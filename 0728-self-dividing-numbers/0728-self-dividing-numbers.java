class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean found=true;
            while(temp>0){
                int b=temp%10;
                temp/=10;
                if(b==0 || i%b!=0){
                    found=false;
                    break;
                }
            }
            if(found){
                list.add(i);
            }
        }
        return list;
    }
}