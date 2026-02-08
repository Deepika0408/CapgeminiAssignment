/*You are developing a small library helper tool that organizes books using Java Collections. The program receives an 
 * ArrayList<String> where each element represents a book record in the format "Category:BookName", such as 
 * "Fiction:Harry Potter" or "Science:A Brief History of Time". Your task is to process this list and build a 
 * HashMap<String, ArrayList<String>> where each key is a book category and each value is an Alphabetically sorted list of book 
 * names belonging to that category. If the same book appears more than once under the same category, only keep one copy. 
 * If a book appears under multiple categories due to data errors, it should be placed only in the first category where it appears, 
 * ignoring later duplicates. The program must also generate a separate ArrayList<String> listing all unique categories 
 * sorted alphabetically, and count how many total books were processed and how many were discarded due to duplication. 
 * Assume input may contain invalid entries missing the “:” separator—such records should be skipped. 
 * The goal is to practice parsing strings, using maps with lists, removing duplicates, and performing sorting operations using
 *  basic Java Collections.
 */

package capgemini;
import java.util.*;

public class Library {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Fiction:Harry Potter");
        list.add("Science:A Brief History of Time");
        list.add("Fiction:Malgudi Days");
        list.add("Fiction:Harry Potter");      
        list.add("Science:Harry Potter");      
        list.add("History:Sapiens");
        list.add("Science:Ender's Game"); 

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        HashSet<String> usedBooks = new HashSet<>();

        int totalBooks = 0;
        int discardedBooks = 0;

        for (String record : list) {

            if (!record.contains(":")) {
                continue;
            }

            String[] parts = record.split(":");
            if (parts.length != 2) {
                continue;
            }

            String category = parts[0].trim();
            String book = parts[1].trim();

            totalBooks++;

            if (usedBooks.contains(book)) {
                discardedBooks++;
                continue;
            }
            if (!map.containsKey(category)) {
                map.put(category, new ArrayList<>());
            }

            map.get(category).add(book);
            usedBooks.add(book);
        }

        for (ArrayList<String> books : map.values()) {
            Collections.sort(books);
        }

        ArrayList<String> categories = new ArrayList<>(map.keySet());
        Collections.sort(categories);
        System.out.println("Books grouped by category:");
        for (String cat : categories) {
            System.out.println(cat + " - " + map.get(cat));
        }

        System.out.println("\nSorted Categories:");
        System.out.println(categories);

        System.out.println("\nTotal books processed: " + totalBooks);
        System.out.println("Books discarded " + discardedBooks);
    }
}
