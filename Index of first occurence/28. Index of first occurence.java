class Solution {
    public int strStr(String haystack, String needle) {
        int k=0; int j=needle.length();

        // for(int i=0; i<haystack.length()-j; i++)
        // {
        //     if(haystack.substring(i,j).equals(needle))
        //     {
        //         return i;
        //     }
        //     j++;
        // }
        if(haystack.indexOf(needle)!=-1)
        {
            return haystack.indexOf(needle);
        }
        return -1;
        
    }
}