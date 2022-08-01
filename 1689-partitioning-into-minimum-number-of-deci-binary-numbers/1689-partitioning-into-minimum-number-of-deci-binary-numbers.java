class Solution {
    public int minPartitions(String n) {
       int max=n.charAt(0);
        System.out.println(n.charAt(0));
       for(int i=1;i<n.length();i++){
          if(n.charAt(i)>max){
              max=n.charAt(i);
          } 

       }
        return max-48;
    }
}