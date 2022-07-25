class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        if(nums[0]<0 & nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (sum > max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
}