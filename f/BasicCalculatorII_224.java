class BasicCalculatorII_224{
  public int calculate(String s){
    if(s == null || s.length() == 0)
      return 0;
    int sign = 1, res = 0;
    Stack<Integer> stack = new Stack<Integer>();
    
    for(int i = 0; i < s.length(); i++){
    //extact num
       if(Character.isDigit(s.charAt(i))){
        int sum = s.charAt(i) - '0';
        while(i < s.length() - 1 && Character.isDigit(s.charAt(i + 1))){
          sum = sum * 10 + s.charAt(i + 1) - '0';
          i++;
        }
        res += sign*sum;
        }else if(s.charAt(i) == '+')
          sign = 1;
        else if(s.charAt(i) == '-')
          sign = -1;
        else if(s.charAt(i) == '('){
          stack.push(res);
          stack.push(sign);
          res = 0;
          sign = 1;
        }else if(s.charAt(i) == ')'){
           res = res * stack.pop() + stack.pop();  //add the res in parentless and then add the num outside the parentless
        
        }
 
    }
    return res;
  }

}
