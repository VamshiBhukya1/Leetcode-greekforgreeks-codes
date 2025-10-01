class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       if(numExchange==1) return Integer.MAX_VALUE;
        int num=numBottles+(numBottles-1)/(numExchange-1);
        return num;
    }
}