class LargestNumber_179{
   public String largestNumber(int[] nums){
       String[] res = new String[nums.length];
       for(int i = 0; i < nums.length; i++){
         res[i] = nums[i] + "";
         
         Comparator<String> comp = new Comparator<String>(){  
           @Override
           public int compare(String s1, String s2){
              String str1 = s1 + s2;       //!!!!!!   compare s1 + s2 and s2+ s1
              String str2 = s2 + s1;
              return str1.compareTo(str2);
           }
         
         };
         
         Arrays.sort(res, comp);
         if(res[res.length - 1].charAt(0) == '0')   //the last one is the final res, check wether its 0
            return "0";
            
        StringBuilder sb = new StringBuilder();
        for(Stirng s : res){
           sb.insert(0, s);
        }
           return sb.toString();
       }
       
   }


}
