class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] arr = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=(i+k)%nums.length;
            arr[index]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}