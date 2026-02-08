/* Create a functional interface called Greeting with a single method sayHello(String name). Using a lambda expression, 
 implement this interface so that it prints a personalized greeting message, such as “Hello, John!”. Then, write a short 
 program that creates a few different greetings by passing different names to the lambda implementation and prints each message.
 */
 
package lambda;
import java.util.*;

interface Greeting{
	public void sayhello(String name);
}

public class program4 {
	public static void main(String[] args) {
		Greeting msg=(name)->System.out.println("Hello, "+name+"!");
		msg.sayhello("Sam");
		msg.sayhello("Ani");
	}
	

}
