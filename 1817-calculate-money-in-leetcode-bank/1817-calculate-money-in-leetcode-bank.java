class Solution {
    public int totalMoney(int n) {
        int week=0;
        int t=0;
        for(int i=1;i<=n;i++){
            t+=week+(i-week*7);
            if(i%7==0) week++;
        }
        return t;
        
    }
}