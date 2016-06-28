class IntersectionOfTwoLL_160{
  public ListNode getIntersectionNode(ListNode n1, ListNode n2){
    ListNode a = n1, b = n2;
    int len1 = 0, len2 = 0;  
     //cal each length and its difference
    while(a != null){
      a = a.next;
      len1++;
    }
    
    while(b != null){
      b = b.next;
      len2++;
    }
    
    a = n1; b = n2;
    if(len2 > len1){
      for(int i = 0; i < len2 - len1; i++)
        b = b.next;
    }else{
      for(int i = 0; i < len1 - len2; i++)
        a = a.next;
    }
    while(a != b){
      a = a.next;
      b = b.next;
    }
     return a;
  }

}
