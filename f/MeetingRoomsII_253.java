class MeetingRoomsII_253{
//if intervals has overlap, will require new meeting room
  public int minMeetingRooms(Interval[] intervals){
    int[] start = new int[intervals.length];
    int[] end = new int[intervals.length];
    for(int i = 0; i < intervals.length; i++){
       start[i] = intervals[i].start;
       end[i] = intervals[i].end;
    }
    
    Arrays.sort(start);
    Arrays.sort(end);
    
    int rooms = 0;
    int endsItr = 0;
    
    //if start[i] < end[endsitr], rooms++
    for(int j = 0; j < start.length; j++){
      if(start[j] < end[endsItr])
        rooms++;
      else
        endsItr++;
    }
    return rooms;
    
  }

}
