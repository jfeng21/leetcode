class BestTimeBuyStock_121{
  //dp O(n), O(1)
  public int maxProfit(int[] prices){
    if(prices == null || prices.length == 0)
      return 0;
    int price = prices[0];  //track min price
    int maxProfit = 0;
    
    for(int i = 0; i < prices.length; i++){
     if(price > prices[i])
       price = prices[i];
    else{
       int pro = prices[i] - price;
      maxProfit = Math.max(maxProfit, pro);
    }
  }
  return maxProfit;
}
}
