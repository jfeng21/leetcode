class PopulatingNextRightII_117{
  public void connect(TreeLinkNode root){
    TreeLinkNode head = root;  //left most node of next lvl
    TreeLinkNode prev = null;  //prev node of next lvl
    TreeLinkNode cur = null;   //cur node of cur lvl
    
    while(head != null){
    cur = head;
    prev = null;
    head = null;
    while(cur != null){
      if(cur.left != null){
        if(prev != null)
          prev.next = cur.left;
        else
          head = cur.left;   //shift to right
        prev = cur.left;    //shift to next level
        }
      if(cur.right != null){
        if(prev != null)
           prev.next = cur.right;
        else
           head = cur.right;
        prev = cur.right;
      }
     cur = cur.next;
     }
    }
   
  }

}
