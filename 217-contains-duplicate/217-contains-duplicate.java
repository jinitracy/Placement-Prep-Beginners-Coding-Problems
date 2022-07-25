class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while(low<high){
            System.out.println(nums[low]);
            System.out.println(nums[low+1]);
            System.out.println(nums[high]);
            System.out.println(nums[high-1]);
            if(nums[low]==nums[low+1]){
                return true;
            }
            else if(nums[high]==nums[high-1]){
                return true;
            }
            else{
                low++;
                high--;
            }
        }
        
        return false;
    }
}