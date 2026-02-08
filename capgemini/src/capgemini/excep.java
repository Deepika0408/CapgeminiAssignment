package capgemini;
import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}

class DataNotFoundException extends Exception {
    public DataNotFoundException(String msg) {
        super(msg);
    }
}

public class excep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> items = new HashMap<>();

        try {
            
            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (id <= 0) {
                throw new InvalidInputException("Item ID must be positive");
            }

            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                throw new InvalidInputException("Item name cannot be empty");
            }

            items.put(id, name);
            System.out.println("Item added successfully");

            System.out.print("Enter ID to search: ");
            int searchId = sc.nextInt();

            if (!items.containsKey(searchId)) {
                throw new DataNotFoundException("Item not found");
            }

            System.out.println("Item Name: " + items.get(searchId));
        }

        catch (InvalidInputException e) {
            System.out.println("Input Error: " + e.getMessage());
        }

        catch (DataNotFoundException e) {
            System.out.println("Search Error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid data type ");
        }

        sc.close();
    }
}

