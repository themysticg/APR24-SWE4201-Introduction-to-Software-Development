import java.util.HashMap;
import java.util.Map;

public class StudentRecordSystem {
    private Map<String, Student> students;

    // Constructor
    public StudentRecordSystem() {
        students = new HashMap<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            System.out.println("Regents Student ID already exists. Cannot add student.");
        } else {
            students.put(student.getId(), student);
            System.out.println("Regents Student added successfully.");
        }
    }

    // Retrieve a student by ID
    public Student getStudent(String id) {
        return students.getOrDefault(id, null);
    }

    // Update a student’s details
    public void updateStudent(String id, String newName, String newCourse) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(newName);
            student.setCourse(newCourse);
            System.out.println("Regents Student details updated successfully.");
        } else {
            System.out.println("Regents Student ID not found.");
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
                System.out.println("-------------");
            }
        }
    }
}
