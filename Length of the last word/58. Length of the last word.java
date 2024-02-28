class Solution {
    public int lengthOfLastWord(String s) {
        String w = s.trim();
        int n = w.length();
        int count=0;

        // if(n<=1)
        // {
        //     return n;
        // }
        
        for(int i=n-1; i>=0;i--)
        {
            if(w.charAt(i)!=' ')
            {
                count++;
            }
            else{break;}
        }
        return count;
    }
}