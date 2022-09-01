class Solution {
    public int lengthOfLastWord(String s) {
        
        int length=0;
        if (s.length()==1) return 1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else{
                if (length>0) return length;
            }
        }    
        return length;   
    }
}