package lambda;
/*Define a functional interface called MathOperation with a single method operate(int a, int b). Using a lambda expression, 
implement addition and subtraction operations. Then, write a small program that calls these lambda implementations to perform 
addition and subtraction on two numbers and prints the results.
*/
interface MathOperation{
	public int operate(int a, int b);
}
public class program1 {

	public static void main(String[] args) {
		MathOperation add=(a,b)->a+b;
		MathOperation sub=(a,b)->a-b;
		int addresult=add.operate(2, 7);
		int subresult=sub.operate(9, 3);
		System.out.print(addresult);
		
		

	}

}
