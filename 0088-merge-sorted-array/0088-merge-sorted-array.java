class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combineArr = new int[m + n];
        for(int i = 0; i < m; i ++)
        {
            combineArr[i] = nums1[i];
        }
        for(int j = 0; j < n; j ++)
        {
            combineArr[j + m] = nums2[j]; // number will add after above loop or after num1 so we write m + j
        }
        Arrays.sort(combineArr);
        
        for(int k = 0;k < (m+n);k++)
        {
            nums1[k] = combineArr[k];
        }
    }
}