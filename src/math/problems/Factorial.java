package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
  int fact=1;
   int number=5;
  for (int i=1; i<=number; i++){
      fact=fact*i;
  }
  System.out.println("Factorial of number:" +fact);

    }
}
