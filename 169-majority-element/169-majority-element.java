class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               count++;
               if(count==nums.length/2){
                   return nums[i];
               }
            }
            else count=0;
        }
        
        return nums[0];
        
    }
}