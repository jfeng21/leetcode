class PlusOne_66{
public int[] plusOne(int[] digits){
if(digits == null || digits.length == 0)
  return digits;
int flag = 1;
int i = 0;

for(i = digits.length - 1; i >= 0; i--){
   digits[i] = digits[i] + flag;
   if(digits[i] > 9){
     flag = 1;
     digits[i] = 0;
   }else
     return digits;
}
//for the begining num, if flag == 1, need to add length one
if(i == -1 && flag == 1){
   int[] newDigits = new int[digits.length + 1];
   newDigits[0] = 1;
   for(int i = 1; i < newDigits.length(); i++)
       newDigits[i] = digits[i];
    return newDigits;
   }else
      return digits;


}
}
