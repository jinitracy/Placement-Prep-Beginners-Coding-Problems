class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gpointer=0, cpointer = 0, count=0;
        while(gpointer<g.length && cpointer<s.length)
        {
            if(g[gpointer]<=s[cpointer])
            {
                count++;
                gpointer++;
                cpointer++;
            }
            else
                cpointer++;
            
        }
        return count;
    }
}