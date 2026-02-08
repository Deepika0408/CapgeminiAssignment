/* Create a program where you have a list of names stored in an ArrayList. Your task is to sort the names in alphabetical 
order using a lambda expression with the Comparator interface. The lambda should define how two strings are compared, and you 
should print the list before and after sorting to show the effect of the lambda-based comparator.
 */
package lambda;
import java.util.*;

public class program3 {
	public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anisha");
        names.add("Dev");
        names.add("Bhavya");
        System.out.println("Before sorting: " + names);
        
        Collections.sort(names,(s1,s2)->s1.compareTo(s2));
        System.out.println("After sorting: " + names);


}
}
