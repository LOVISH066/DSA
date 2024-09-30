class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for(int[] account : accounts)
        {
            int sum = 0;
            for(int hour : account)
            {
                sum = sum + hour;
            }
            maximumWealth = Math.max(maximumWealth, sum);
        }
        return maximumWealth;
    }
}