class ValidParenthese_20{
private static final Map<Character, Character> map = new HashMap<Character,Character>(){{
put('(', ')');
put('[', ']');
put('{', '}');
}};

public boolean isValid(String s){
   if(s == null || s.length() == 0)
     return true;
     
  Stack<Character> stack = new Stack<>();

   for(char c : s.toCharArray()){
       if(map.containsKey(c))
         stack.push(c);
       else if(stack.isEmpty() || map.get(stack.pop()) != c){
           return false;
       }
   
   }
  return stack.isEmpty();

}


}
