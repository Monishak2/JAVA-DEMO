package arithmatic;
import java.util.Scanner;
public class calculator {
	public static void main (String args[]) {

      double no1;
      double no2;
      double result;
      char op;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter inputs: ");
      no1 =sc.nextDouble();
      no2 = sc.nextDouble();
      System.out.print("\nSelect an operator (+, -, *, /): ");
      op = sc.next().charAt(0);
      switch(op) {
         case '+': result = no1 + no2;
            break;
         case '-': result = no1 - no2;
            break;
         case '*': result = no1 * no2;
            break;
         case '/': result= no1 / no2;
            break;
      default: System.out.printf("INVALID OPERATOR");
         return;
      }
      System.out.print("\nThe answer is:\n");
      System.out.printf(no1 + " " + op + " " + no2 + " = " + result);
   }
}