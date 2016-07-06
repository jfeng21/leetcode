class RomanToInteger_13{
   public int romanToInt(String s){
     int len = s.length();
     
     HashMap<Character, Integer> map = new HashMap<Character, Integer>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);
     
     int res = map.get(s.charAt(len - 1));
     int pivot = res;
     for(int i = len - 2; i >= 0; i--){
       int cur = map.get(s.charAt(i));
       if(cur >= pivot){  //if it is before larger num, minis
            res += cur;
       }else{
            res -=cur;
       }
       pivot = cur;
     }
     return res;
   }

}
