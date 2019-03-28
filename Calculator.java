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
     token.addLast(arr[x]);
     //if fails, just getlast and return the Double.parseDouble(token.getLast());
     try {
       Double.parseDouble(token.getLast());
     }
     catch (NumberFormatException e) {
       //Number or operation.
       double addVal = 0.0;
       String NumOrOp = token.removeLast();
       //do the actual operations.
       if (NumOrOp.equals("*")) {
         double val1 = Double.parseDouble(token.removeLast());
         double val2 = Double.parseDouble(token.removeLast());

         addVal = val2 * val1;
         token.addLast(addVal + "");
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
     }
   }
   //parse double it, not int.
   return Double.parseDouble(token.getLast());
 }
 public static void main(String[] args) {
   System.out.print(eval("11 3 - 4 + 2.5 *"));
 }
}
