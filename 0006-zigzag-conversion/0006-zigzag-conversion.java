class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
         String[] arr=new String[numRows];
         Arrays.fill(arr,"");
         int currentRow=0;
         boolean goingdown=true;
        for(int i=0;i<s.length();i++){
            arr[currentRow]+=s.charAt(i);
            if(i!=0){
            if(currentRow==numRows-1 || currentRow==0){
                goingdown=!goingdown;
            }
            }
            if(goingdown){
                currentRow++;
            }
            else{
                currentRow--;
            }
        }
        String str="";
        for(int i=0;i<numRows;i++){
            str+=arr[i];
        }
        return str;
    }
}