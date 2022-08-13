class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String str=Integer.toString(num);
        int anchor=0;
        int count=0;
        for(int i=k;i<=str.length();i++){
            int div=Integer.parseInt(str.substring(anchor,i));
            if(div!=0 && num%div==0){
                    count++;
                }
            anchor++;
            }
        
        return count;
        }
    }


