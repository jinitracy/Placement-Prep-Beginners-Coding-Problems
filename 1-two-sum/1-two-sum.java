class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(n.containsKey(com)){
                return new int[] {n.get(com),i};
            }
            n.put(nums[i],i);
        }
        return nums;
    }
}