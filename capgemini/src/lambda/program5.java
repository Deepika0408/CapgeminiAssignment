/*Define a functional interface named CompareNumbers with one method compare(int a, int b) that returns a boolean. Using a 
lambda expression, implement logic that checks whether the first number is greater than the second. Write a small program to call 
this lambda by giving different pairs of numbers and printing whether the comparison is true or false.
*/
package lambda;
import java.util.*;

interface  CompareNumbers{
	public boolean compare(int a,int b);
}

public class program5 {
	public static void main(String[] args) {
		CompareNumbers greater=(a,b)->a>b;
		System.out.println("26>19: "+greater.compare(26,19));
		System.out.println("7>17: "+greater.compare(7,17));
		System.out.println("4>0: "+greater.compare(4,0));
	}

}
