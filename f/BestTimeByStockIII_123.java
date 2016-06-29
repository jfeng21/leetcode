class BestTimeByStockIII_123{
//set a boundy i, max profit = max{preProfit[i] + postProfit[i]}
//O(n), O(n)
  public int maxProfit(int[] prices){
    if(prices.length < 2)  return 0;
    int n = prices.length;
    int[] pre = new int[n];
    int[] post = new int[n];
    
    int curMin = prices[0];
    for(int i = 1; i < n; i++){
       curMin = Math.min(curMin, prices[i]);
       pre[i] = Math.max(pre[i - 1], prices[i] - curMin);
    }
    int curMax = prices[n - 1];
    for(int i = n - 2; i >= 0; i--){
      curMax = Math.max(curMax, prices[i]);
      post[i] = Math.max(post[i + 1], curMax - prices[i]);
    }
    int max = 0;
    for(int i = 0; i < n; i++){
      max = Math.max(pre[i] + post[i], max);
    }
  return max;
  }
}
