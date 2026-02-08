/*
You are asked to write a simple Java program that manages student marks using collections. 
The program will first take a list of student names and their scores in the form of an ArrayList of strings, 
where each entry looks like "John,85" or "Asha,92". Your task is to parse this list and store the data in a 
HashMap<String, Integer> where the key is the student’s name and the value is the score.
If a student appears more than once in the list, you must update the score to keep only the highest marks for that student.
After building the map, the program should display: (1) the list of all students sorted alphabetically using the keys of the map, 
(2) the highest and lowest scorer based on the stored values, and (3) all students who scored above 90 using a new ArrayList<String> 
created from the map. Assume the input list may contain extra spaces or inconsistent casing, so you must clean and normalize 
names (trim spaces and convert to proper case). Ignore invalid entries that don't follow the "name,score" format. The goal is to 
practice basic data cleaning, map insertion rules, list iteration, 
and simple sorting using Java Collections.

*/
package capgemini;
import java.util.*;
public class Stumarks {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("John,85");
		list.add("Ron,94");
		list.add("Asha,90");
		list.add("Zara,88");
		list.add("John,89");
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : list) {
            String[] parts = s.split(",");

            String name = parts[0].trim();
            int marks = Integer.parseInt(parts[1].trim());

            if (map.containsKey(name)) {
                if (marks > map.get(name)) {
                    map.put(name, marks);
                }
            } else {
                map.put(name, marks);
            }
        }

        ArrayList<String> names = new ArrayList<>(map.keySet());
        Collections.sort(names);

        System.out.println("Students sorted:");
        for (String n : names) {
            System.out.println(n + " = " + map.get(n));
        }

        String highName = "";
        String lowName = "";
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;

        for (String n : map.keySet()) {
            int m = map.get(n);

            if (m > high) {
                high = m;
                highName = n;
            }
            if (m < low) {
                low = m;
                lowName = n;
            }
        }

        System.out.println("Highest scorer: " + highName + " = " + high);
        System.out.println("Lowest scorer: " + lowName + " = " + low);

        ArrayList<String> li = new ArrayList<>();
        for (String n : map.keySet()) {
            if (map.get(n) > 90) {
                li.add(n);
            }
        }

        System.out.println("Students scoring above 90:");
        System.out.println(li);
		
	}

}




