class MaxPointsOnALIne149{
  public int maxPoint(Point[] points){
     if(points.length <= 0)
       return 0;
     if(points.length <= 2)
       return points.length;
      int res = 0;
      //check same point and same x, put same k into map with count values
      for(int i = 0; i < points.length; i++){
        Map<Double, Integer> map = new HashMap<>();
        int samep = 0;
        int samex = 1;
        
          for(int j = 0; j < points.length; j++){
          if(i != j){
             if(points[j]. x == points[i].x ){
               samex++;
               continue;
             }
             if(points[j].x == points[i].x && points[j].y == points[i].y)
               samep++;
            //count same k
            double k = (double)(points[j].y - points[i].y) / (double)(points[j].x - points[i].x);
            if(map.containsKey(k)){
               map.put(k, map.get(k) + 1);
            }else{
               map.put(k, 2);
            }
              res = Math.max(res, map.get(k) + samep);
          }
        
      }
      res = Math.max(res, samex);
  }
return res;
}
