class Solution {
    public int addDigits(int num) {
        int sum=0;
        int rem=0;
        while(Integer.toString(num).length()>1){
            while(num!=0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
            num=sum;
            sum=0;
        }
        
        return num;
        
    }
}