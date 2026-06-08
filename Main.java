import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
			
            System.out.println("\n-----Menu-----");
            System.out.println("1. Add a student.");
            System.out.println("2. Display all students.");
            System.out.println("3. Search for a student by ID."); 
            System.out.println("4. Calculate and display the average mark.");
            System.out.println("5. Exit");
            
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
				
                System.out.print("Student ID: ");
                String id = sc.nextLine();
                System.out.print("Student Name: ");
                String name = sc.nextLine();
                System.out.print("Student Marks: ");
                double marks = sc.nextDouble();
                
                list.add(new Student(id, name, marks));
                System.out.println("Saved!");
            }

            if (choice == 2) {
				
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).displayStudentInfo();
                }
            }

            if (choice == 3) {
				
                System.out.print("Search ID: ");
                String searchId = sc.nextLine();
                boolean found = false; 
                
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getStudentId().equals(searchId)) {
                        list.get(i).displayStudentInfo();
                        found = true; 
                    }
                }
                
                if (found == false) {
                    System.out.println("Student Not Found.");
                }
            }

            if (choice == 4) {
                double total = 0;
                for (int i = 0; i < list.size(); i++) {
                    total += list.get(i).getMarks();
                }
                System.out.println("Average: " + (total / list.size()));
            }
        }
        System.out.println("Exit Program.");
    }
}