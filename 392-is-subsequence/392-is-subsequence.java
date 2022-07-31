class Solution {
    public boolean isSubsequence(String s, String t) {
    if(s.length()>t.length()) return false;
    if((t.length()==0) && s.length()!=0) return false;
    if(s.length()==0 && t.length()!=0) return true; 
    if(s.length()==0 && t.length()==0) return true; 
    int i = 0;
    for(int j = 0;j<t.length() && i<s.length();j++)
    {
     if(t.charAt(j) == s.charAt(i)) i++;
    }
        return i == s.length();  
    }
}