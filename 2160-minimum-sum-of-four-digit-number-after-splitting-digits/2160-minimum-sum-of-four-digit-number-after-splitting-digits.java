class Solution {
    public int minimumSum(int num) {
        int[] n=new int[4];
        for(int i=3;i>=0;i--){
            n[i]=num%10;
            num=num/10;
        }
        Arrays.sort(n);
        int sum=0;
        String s1=Integer.toString(n[0])+Integer.toString(n[2]);
        String s2=Integer.toString(n[1])+Integer.toString(n[3]);
        sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        return sum;
    }
}