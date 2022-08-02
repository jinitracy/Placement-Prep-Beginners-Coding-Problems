class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            int f=nums[i];
            int val=nums[i+1];
            for(int j=0;j<f;j++){
                list.add(val);
            }
        }
        int[] li=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            li[i]=list.get(i);
        }
        
        return li;
    }
}