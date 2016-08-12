class ListMerge{
public class ListMerge {
      public static String[] mergeList(String[] s1, String[] s2){
         int m = s1.length;
         int n = s2.length;
         int len = m + n - 1;
         
         int i = m - 1, j = n - 1;
         String[] res = new String[len + 1];
         while(i >= 0 && j >= 0){
             res[len--] = s1[i--];
             res[len--] = s2[j--];
         }
         while(i >= 0)
             res[len--] = s1[i--];
         while(j >= 0)
             res[len--] = s2[j--];
         
         return res;
      }
      
    public static void main(String[] args) {
        String[] s1 = {"A", "A", "A", "A", "A","A"};
        String[] s2 = {"B", "B", "B", "B"};
     String[] res = mergeList(s1, s2);
     for(String s: res)
     System.out.print(s);
    }
    


}
