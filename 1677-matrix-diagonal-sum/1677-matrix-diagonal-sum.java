class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;
        for(int i = 0;i < r;i++)
        {
            sum = sum + mat[i][i];
            if(i != c - i - 1)
                sum = sum + mat[i][c - i - 1];

        }
        return sum;
    }
}