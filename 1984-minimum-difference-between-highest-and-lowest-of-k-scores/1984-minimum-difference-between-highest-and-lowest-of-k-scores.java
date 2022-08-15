class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        if(k==1) return 0;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int d=0;
            for(int j=k-1;j<nums.length;j++){
                d=nums[j]-nums[j-(k-1)];
                min=Math.min(min,d);
            }
        return min;
    }
}


