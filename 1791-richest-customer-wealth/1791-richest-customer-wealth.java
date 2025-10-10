class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int n=accounts.length;
        int m=accounts[0].length;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<m;j++){
                s+=accounts[i][j];
            }
                sum=Math.max(sum,s);
        }
        return sum;
    }
}