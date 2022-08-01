class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            String str=sentences[i].toString();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }

        }
        return max+1;
    }
}