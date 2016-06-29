class BestTimeBuyStockII_122{
//greedy  O(n), O(1)
   public int maxProfit(int[] prices){
     if(prices == null || prices.length == 0)  return 0;
     int pro = 0;
     
     for(int i = 0; i < prices.length - 1; i++){
       if(prices[i + 1] > prices[i])
         pro += prices[i + 1] - prices[i]; 
     }
     return pro;
   }
}
