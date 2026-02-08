package capgemini;
import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Student1{

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                list.add(new Student(roll, name));
                System.out.println("Student added successfully");

            }
            // UPDATE STUDENT
            else if (choice == 2) {

                System.out.print("Enter Roll No to update: ");
                int roll = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (Student s : list) {
                    if (s.roll == roll) {
                        System.out.print("Enter New Name: ");
                        s.name = sc.nextLine();
                        System.out.println("Student updated successfully");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }

            }

            else if (choice == 3) {

                System.out.print("Enter Roll No to delete: ");
                int roll = sc.nextInt();

                boolean found = false;

                for (Student s : list) {
                    if (s.roll == roll) {
                        list.remove(s);
                        System.out.println("Student deleted successfully");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }

            }

            else if (choice == 4) {

                if (list.isEmpty()) {
                    System.out.println("No students available");
                } else {
                    System.out.println("\nRoll No → Name");
                    for (Student s : list) {
                        System.out.println(s.roll + " → " + s.name);
                    }
                }

            }
            else if (choice == 5) {

                System.out.println("Exiting program...");

            }
            else {

                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}

