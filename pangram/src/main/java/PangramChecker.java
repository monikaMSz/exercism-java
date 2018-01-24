public class PangramChecker {

    public boolean isPangram(String input) {
       input = input.toLowerCase();
       int count = 0;

       for(char ch = 'a';ch <= 'z';ch++){
           if(input.indexOf(ch)>=0){
               count++;
           }
       }
       if(count==26){
           return true;

       }else{
           return false;
       }
    }

}
