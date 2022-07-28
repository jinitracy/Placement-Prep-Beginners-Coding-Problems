class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int count=0;
        char S[] = s.toCharArray();
        Arrays.sort(S);
        char T[] = t.toCharArray();
        Arrays.sort(T);
        for(int i=0;i<s.length();i++){
            if(S[i]==T[i]){
              count++;  
            }
           if (count==s.length()) return true;
        }
        
        return false;
        
    }
}