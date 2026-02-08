package capgemini;
import java.util.*;

/*
//String Validation 
public class StringB {
    public static void main(String[] args) {

        String username = "Hrlllo123";
        boolean isValid = true;
        if (username.length() < 5 || username.length() > 12) {
            isValid = false;
            System.out.println("Invalid username");
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);

            if (!Character.isLetter(ch)) {
                isValid = false;

                if (Character.isDigit(ch)) {
                    System.out.println("Invalid username (contains digits)");
                } else if (ch == ' ') {
                    System.out.println("Invalid username (contains spaces)");
                } else {
                    System.out.println("Invalid username (contains special characters)");
                }
                break;
            }
        }

        if (isValid) {
            System.out.println("Valid username");
        }
    }
}
*/

/*
//String Comparison
public class StringB {
    public static void main(String[] args) {

        String storedPass = "Admin@123";
        String enteredPass = "Admin@123";

        StringBuilder result = new StringBuilder();

        if (storedPass.equals(enteredPass)) {
        	System.out.println(result.append("Login successful"));
            result.append("Login successful");
        } else {
        	System.out.println(result.append("Login failed"));
        }

        
    }
}

*/

/*
//String Parsing 
public class StringB {
    public static void main(String[] args) {

        String order = "ORDERID-123|PRODUCT-Mobile|PRICE-15000";

        String[] parts = order.split("\\|");

        StringBuilder orderId = new StringBuilder();
        StringBuilder product = new StringBuilder();
        StringBuilder price = new StringBuilder();

        orderId.append(parts[0].split("-")[1]);
        product.append(parts[1].split("-")[1]);
        price.append(parts[2].split("-")[1]);

        System.out.println("Order ID = " + orderId);
        System.out.println("Product = " + product);
        System.out.println("Price = " + price);
    }
}

*/

/*
// String Manipulation
public class StringB {
    public static void main(String[] args) {

        String original = "resume.pdf";
        String timestamp = "20260129";

        StringBuilder newFileName = new StringBuilder();

        newFileName.append(timestamp);
        newFileName.append("_");
        newFileName.append(original);

        System.out.println("New File Name = " + newFileName);
    
}
}
*/

/*
//String Reversal 
public class StringB {
    public static void main(String[] args) {

        String accNo = "1234567890";
        int len = accNo.length();
        String first = accNo.substring(0, len - 4);
        String last = accNo.substring(len - 4);
        StringBuilder reversedPart = new StringBuilder(last);
        reversedPart.reverse();

        String maskedValue = first + reversedPart;
        System.out.println("Masked Value = " + maskedValue);
    }
}
*/

/*
//String Frequency
public class StringB {
    public static void main(String[] args) {

        String text = "hello";
        StringBuilder result = new StringBuilder();

        boolean[] visited = new boolean[text.length()];

        for (int i = 0; i < text.length(); i++) {

            if (visited[i])
                continue;

            char ch = text.charAt(i);
            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (ch == text.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            result.append(ch)
                  .append(" = ")
                  .append(count)
                  .append("\n");
        }

        System.out.println(result);
    }
}

*/

/*
// String Palindrome
public class StringB {

	public static void main(String[] args) {
		String s="hello";
		StringBuilder str1=new StringBuilder(s);
		str1.reverse();	
		String rev=str1.toString();
		if(s.equals(rev)) {
			System.out.print("Palindrome");	
		}
		else {
			System.out.print("Not Palindrome");
		}

	}

}
*/

/*
//String Tokenization
public class StringB {
    public static void main(String[] args) {

        String errorCodes = "E101,E205,E404,E500";
        StringBuilder result = new StringBuilder();

        String[] codes = errorCodes.split(",");

        for (int i = 0; i < codes.length; i++) {
            result.append("Processing error code: ")
                  .append(codes[i])
                  .append("\n");
        }

        System.out.println(result);
    }
}
*/

/*
//String Trimming 
public class StringB {
    public static void main(String[] args) {

        String name = "   Sho  ";

        String n = name.trim();

        StringBuilder n1 = new StringBuilder(n);

        System.out.println("Name =" +n1);
    }
}

*/

/*
//String Immutability
public class StringB {
    public static void main(String[] args) {

        StringBuilder status = new StringBuilder("Status:");

        for (int i = 1; i <= 10000; i++) {
            status.append(" Update").append(i);
        }

        System.out.println("Status updated successfully");
    }
}
*/

