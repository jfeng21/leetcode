class MergeIntervals_56{
   public List<Interval> merge(List<Interval> intervals){
       if(intervals == null || intervals.size() <= 1)  return intervals;
       //sort intervals
       Collections.sort(intervals, new IntervalComparator());  //sort first!!!!!!
       List<Interval> res = new ArrayList<Interval>();
       Interval pre = intervals.get(0);
       for(int i = 1; i < intervals.size(); i++){
         Interval cur = intervals.get(i);
         
         if(pre.end >= cur.start){    //merge
            Interval merged = new Interval(pre.start, Math.max(pre.end, cur.end));
            pre = merged;
         }else{
           res.add(pre);
           pre = cur;
         }
       }
       res.add(pre);
       return res;
   }
   
   class Interval{
     int start, end;
     Interval(){start = 0; end = 0;}
     Interval(int s, int e){start = s; end = e; };
   }
   
   class IntervalComparator implements Comparator<Interval>{
      public int compare(Interval i1, Interval i2)
        return i1.start - i2.start;
   }
}
