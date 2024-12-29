class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = -101;

        for(int traversalptr = 0; traversalptr < nums.length; traversalptr ++)
        {
            int currentelement = nums[traversalptr];
            if(prev != currentelement)
            {
                nums[k] = currentelement;
                k++;
                prev = currentelement;
            }
        }
        return k;
    }
}