class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < buy){
                buy = prices[i] ;
            }else{
                int profit = prices[i] - buy;
                maxprofit = Math.max(profit , maxprofit) ;
            }
        }
        return maxprofit  ;
    }
}