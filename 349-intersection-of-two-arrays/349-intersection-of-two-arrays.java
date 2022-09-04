class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> sol=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.getOrDefault(nums2[i],0)==1){
                sol.add(nums2[i]);
                map.put(nums2[i],0);
            }
        }
        
        int[] arr=new int[sol.size()];
        for(int i=0;i<sol.size();i++){
            arr[i]=sol.get(i);
        }
        return arr;
        
    }
}