class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){

            int value=0;

            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    value=prices[i]-prices[j];
                    break;

                }
                value=prices[i];

            }
            res[i]=value;
        }
         res[n-1]=prices[n-1];
        return res;
    }
}