class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p = m - 1;
        int q = n - 1;
        int b = m + n - 1;

        while(p>=0 && q>=0)
        {

            if(nums1[p] > nums2[q])
            {
                nums1[b] = nums1[p];
                p--;
            }
            else
            {
                nums1[b] = nums2[q];
                q--;
            }
            b--;
        }
        while (q >= 0) 
        {
            nums1[b] = nums2[q];
            q--;
            b--;
        }
    }
}