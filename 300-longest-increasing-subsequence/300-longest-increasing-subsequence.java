class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=1) return nums.length;
        int[] lis=new int[nums.length];
        Arrays.fill(lis,1);
        int max=-1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    lis[i]=Math.max(lis[j]+1,lis[i]);
                }
            }
            max=Math.max(max,lis[i]);
        }
        return max;
    }
}