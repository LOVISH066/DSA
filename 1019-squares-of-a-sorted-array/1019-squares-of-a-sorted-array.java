class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ind = n -1;
        while(l <= r)
        {
            int sqrl = nums[l] * nums[l];
            int sqrr = nums[r] * nums[r];
            if(sqrr > sqrl)
            {
                res[ind] = sqrr;
                r--;
            }
            else
            {
                res[ind] = sqrl;
                l++;
            }
            ind --;
        }
        return res;
    }
}