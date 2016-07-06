class InsertInterval_57{
  public List<Interval> insert(List<Interval> intervals, Interval newInterval){
      List<Interval> res = new ArrayList<Interval>();
      int i = 0;
      //add all intervals ending before new Interval starts
      while(i < intervals.size() && intervals.get(i).end < newInterval.start){
         res.add(intervals.get(i++));
      }
      //merge overlapping intervals 
      while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
         newInterval = new Interval(Math.min(newInterval.start, intervals.get(i).start), Math.max(newInterval.end, intervals.get(i).end));
         i++;
      }
      res.add(newInterval);
      //add the rest intervals
      while(i < intervals.size()){
        res.add(intervals.get(i++));
      }
      return res;
  }
  

}
