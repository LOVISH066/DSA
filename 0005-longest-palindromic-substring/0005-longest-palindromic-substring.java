class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        String longestStr = "";
        int maxlen = 0;
        // for odd - ab a ba
        for(int mid = 0; mid < length; mid ++)
        {
            int i = mid - 1;
            int j = mid + 1; 
            int currentlen = 1;
            while(i >= 0 && j < length && s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
                currentlen += 2; 
            }

            if(currentlen > maxlen)
            {
                longestStr = s.substring(i + 1, j);// ans for odd
                maxlen = currentlen;
            }
        }
        // for even -  ab ab
        for(int mid = 0; mid < length; mid++)
        {
            int i = mid;
            int j = i + 1;
            int currentlen = 0;
            while(i >= 0 && j < length && s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
                currentlen += 2;
            }
            if(currentlen > maxlen)
            {
                longestStr = s.substring(i + 1, j);// ans for odd
                maxlen = currentlen;
            }
        }

        return longestStr;
    }
}