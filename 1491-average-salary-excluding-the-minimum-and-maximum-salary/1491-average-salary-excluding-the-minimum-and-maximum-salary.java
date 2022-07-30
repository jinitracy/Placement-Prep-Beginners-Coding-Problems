class Solution {
    public double average(int[] salary) {
        int sum=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            System.out.println(salary[i]);
            sum+=salary[i];
        }
        double avg=(double)sum/(salary.length-2);
        return avg;
    }
}