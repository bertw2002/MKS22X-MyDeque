public class Calculator{
  /*Evaluate a postfix expression stored in s.
 *Assume valid postfix notation, separated by spaces.
 */
 public static double eval(String s){
   MyDeque token = new MyDeque();
   for (int x = 0; x < s.length(); x++){
     while (!(s.substring(x, x + 1).equals(" "))){
       token.addFirst(Integer.parseInt(s.substring(x, x + 1)));
       x++;
     }
   }



   return 0.0;
 }
}
