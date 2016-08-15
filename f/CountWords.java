//count word in a string
public class CountWords{
   public int countWords(String s){
    //  String[] words = s.split("\\s+");
    //  return words.length;
    
    int count = 0;
    boolean word = false;
    int len = s.length() - 1;
    
    for(int i = 0; i < len; i++){
      if(Character.isLetter(s.charAt(i)) && i != len)
         word = true;
      else if(!Character.isLetter(s.charAt(i)) && word){
         count++;
         word = false;
      }else if(!Character.isLetter(s.charAt(i)) && i == len)
         count++;
    }
      return count;
      
   }

}
