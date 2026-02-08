package lambda;
import java.util.*;

/*Create a list of integers that contains both positive and negative numbers. Use the removeIf() method combined with a 
lambda expression to remove all negative numbers from the list. After the removal, print the updated list to show that only 
the positive values remain. Avoid using any streams; rely only on the lambda inside removeIf().
*/
public class program2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(-20);
		list.add(76);
		list.add(18);
		list.add(-4);
		
		list.removeIf(n->n<0);
		System.out.print(list);

	}

}

