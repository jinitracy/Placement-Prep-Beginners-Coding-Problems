class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> li=new LinkedList<>();
        int len = num.length - 1;
        while(len >= 0 || k != 0){
            if(len >= 0){
                k += num[len--];
            }
            
            li.addFirst(k % 10);
            k /= 10;
        }
        return li;
    }
}