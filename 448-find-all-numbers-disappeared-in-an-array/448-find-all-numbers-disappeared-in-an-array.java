class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int curr=Math.abs(nums[i]);
            nums[curr-1]=-(Math.abs(nums[curr-1]));
        }
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) li.add(i+1);
        }
        
        return li;
    }
}