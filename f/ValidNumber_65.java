class ValidNumber_65{
public boolean isNumber(String s){
 s = s.trim();
 boolean point = false;
 boolean e = false;
 boolean num = false;
 boolean numE = false;
 
 for(int i = 0; i < s.length(); i++){
 if(Character.isDigit(s.charAt(i))){
   num = true;
   numE = true;
 }else if(s.charAt(i) == '.'){
    if(point || e)
       return false;
    point = true;
    
 }else if(s.charAt(i) == 'e'){
     if(e || !num)
       return false;
    numE = false;  //make if false since hav't check the num after e
    e = true;
 }else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
     if(i != 0 && s.charAt(i - 1) != 'e')
       return false;
 }else 
    return false;
 
 
 }
return num && numE;
}

}
