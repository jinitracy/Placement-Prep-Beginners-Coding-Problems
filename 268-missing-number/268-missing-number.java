class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length;
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (i==nums[j]) break;
                if (j==nums.length-1) return i;
            }
        }
        return 0;
    }
}