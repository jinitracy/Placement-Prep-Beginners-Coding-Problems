class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            
    int flag=0;
    ArrayList<Boolean> result =  new ArrayList<Boolean>();
        
    for(int i=0;i<candies.length;i++)
    {
    for(int j=0;j<candies.length;j++)
    {
    if(i!=j){
    if (candies[i]+extraCandies>=candies[j])
    {
     flag=1;
    }
    else
    {
     flag=0;
     break;
    }   
        }
    }      
    if (flag==1)
    {
     result.add(true);
    }
    else
    {
     result.add(false);
    }
   }
      
        return result;
        
    }
}