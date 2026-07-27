class Solution {
    static boolean kmp(String s,String p){
        int lps[]=new int[p.length()];
        int i=1;
        int j=0;
        while(i<p.length()){
            if(p.charAt(i)==p.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        i=0;
        j=0;
        while(i<s.length()){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            if(j==p.length()){
                return true;
            }
            else if(i<s.length() && s.charAt(i)!=p.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        if(kmp(sb.toString(),b)){
            return count;
        }
        sb.append(a);
        count++;
        if(kmp(sb.toString(),b)){
            return count;
        }
        return -1;
        
    }
}