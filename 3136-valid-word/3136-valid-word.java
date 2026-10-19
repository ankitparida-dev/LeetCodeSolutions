class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowels=0;
        int consanants=0;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i'||ch=='o' || ch=='u'){
                    vowels++;
                }
                else{
                    consanants++;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
          return vowels>=1 && consanants>=1;
    }
}