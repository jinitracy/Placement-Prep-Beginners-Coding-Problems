class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;
        double num=Math.round(Math.log(n)/Math.log(3));
        if(n==Math.pow(3,num)){
            return true;
        }
        return false;
    }
}