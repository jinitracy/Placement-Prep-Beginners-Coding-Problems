class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1) return true;
        if(n==0)return false;
        double a = Math.log(n) / Math.log(4);
        if(Math.ceil(a)==Math.floor(a))
            return true;
        return false;
    }
}