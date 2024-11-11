import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRecordSystem system = new StudentRecordSystem();

        System.out.println("Welcome to the Regents Student Record System");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a New Regents Student");
            System.out.println("2. Retrieve Regents Student Information");
            System.out.println("3. Update Regents Student Information");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Regents Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Regents Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    // Show progress bar before adding student
                    System.out.println("Adding student, please wait...");
                    ProgressBar.showProgressBar(5);

                    system.addStudent(new Student(id, name, course));
                    break;
                
                case 2:
                    System.out.print("Enter Regents Student ID: ");
                    id = scanner.nextLine();

                    // Show progress bar before retrieving student
                    System.out.println("Retrieving information, please wait...");
                    ProgressBar.showProgressBar(5);

                    Student student = system.getStudent(id);
                    if (student != null) {
                        System.out.println("Regents Student Details:");
                        System.out.println(student);
                    } else {
                        System.out.println("Regents Student ID not found.");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter Regents Student ID to update: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Course: ");
                    course = scanner.nextLine();

                    // Show progress bar before updating student
                    System.out.println("Updating student, please wait...");
                    ProgressBar.showProgressBar(5);

                    system.updateStudent(id, name, course);
                    break;
                
                case 4:
                    // Show progress bar before displaying all students
                    System.out.println("Loading all students, please wait...");
                    ProgressBar.showProgressBar(5);

                    System.out.println("All Students:");
                    system.displayAllStudents();
                    break;
                
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
