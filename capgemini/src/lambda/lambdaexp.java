package lambda;

public class lambdaexp {

	public static void main(String[] args) {
		MaxFinder m=(num1,num2)->num1>num2?num1:num2;
		int result=m.max(10, 20);
		System.out.print(result);

	}

}
