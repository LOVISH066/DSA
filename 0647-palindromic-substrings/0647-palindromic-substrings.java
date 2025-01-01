class Solution {
    public int countSubstrings(String s) {
        int length = s.length();
        int count = 0;
        for (int mid = 0; mid < length; mid++) {
            int i = mid, j = mid;
            while (i >= 0 && j < length && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                count += 1;
            }
        }
        for (int mid = 0; mid < length - 1; mid++) {
            int i = mid, j = mid + 1;
            while (i >= 0 && j < length && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                count += 1;
            }
        }

        return count;
    }
}
