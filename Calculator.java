import java.util.Arrays;
public class Calculator{
  /*Evaluate a postfix s stored in s.
 *Assume valid postfix notation, separated by spaces.
 */
 public static double eval(String s){
   MyDeque<String> token = new MyDeque<String>();
   //separates spaces, makes life easier.
   String[] arr = s.split(" ");
   for (int x = 0; x < arr.length; x++){
     double addVal = 0.0;
     token.addLast(arr[x]);
     //Number of operation.
     String NumOrOp = token.removeLast();
     if (NumOrOp.equals("*")) {
       double val1 = Double.parseDouble(token.removeLast());
       double val2 = Double.parseDouble(token.removeLast());

       addVal = val2 * val1;
       token.addLast("" + addVal);
     }
     else if (NumOrOp.equals("+")) {
      double val1 = Double.parseDouble(token.removeLast());
      double val2 = Double.parseDouble(token.removeLast());
      addVal = val1 + val2;
      token.addLast(addVal + "");
     }
     else if (NumOrOp.equals("/")) {
       double val2 = Double.parseDouble(token.removeLast());
       double val1 = Double.parseDouble(token.removeLast());
       addVal = val1 / val2;
       token.addLast(addVal + "");
     }
     else if (NumOrOp.equals("-")) {
       double val2 = Double.parseDouble(token.removeLast());
       double val1 = Double.parseDouble(token.removeLast());
       addVal = val1 - val2;
       token.addLast(addVal + "");
     }



     else if (NumOrOp.equals("%")) {
       double val2 = Double.parseDouble(token.removeLast());
       double val1 = Double.parseDouble(token.removeLast());
       addVal = val1 % val2;
       token.addLast(addVal + "");
     }
     else{

     }
   }
   return 0.0;
 }
 public static void main(String[] args) {
   eval("11 3 - 4 + 2.5 *");
 }
}
