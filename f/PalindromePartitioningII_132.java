class PalindromePartitioningII_132{
//dp O n^2
//state: f[i] min cut for prev i 
//func: f[i] = min(f[j] + 1), j < i && j + 1 ~i isPanlindrome
//ini: f[0] = -1
//ans: f[s.lenght()]


     public int minCut(String s){
       if(s == null || s.length() == 0)  return 0;
       
       //prep for isPalindrome, reduce O(n)time
       boolean[][] isPalindrome = isPalindrome(s);
       //initialize
       int[] f = new int[s.length() + 1];
       f[0] = 0;
       
       for(int i = 1; i <= s.length(); i++){
        f[i] = Integer.MAX_VALUE;
         for(int j = 0; j < i; j++){
           if(isPalindrome[j][i - 1])
              f[i] = Math.min(f[i], f[j] + 1);
         }
       }
       return f[s.length()] - 1;
     }
     
   boolean[][] isPalindrome(String s){
      boolean[][] isPalindrome = new boolean[s.length()][s.length()];
      
      for(int i = 0; i < s.length(); i++){
        isPalindrome[i][i] = true;
      }
      
      for(int i = 0; i < s.length() - 1; i++){
        isPalindrome[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
      }
      
      for(int len = 2; len < s.length(); len++){
         for(int start = 0; start + len < s.length(); start++){
           isPalindrome[start][start + len] = isPalindrome[start + 1][start + len - 1] && s.charAt(start) == s.charAt(start + len);
         }
      }
      return isPalindrome;
   }




}
